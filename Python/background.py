import cv2
import mediapipe as mp
import numpy as np

mp_drawing = mp.solutions.drawing_utils
mp_selfie_segmentation = mp.solutions.selfie_segmentation
bg_image = cv2.imread('\\background1.jpg')

model = mp_selfie_segmentation.SelfieSegmentation(model_selection = 1)

cam =  cv2.VideoCapture(0)

while True:
    flag, frame = cam.read()
    if not flag:
        print('Could not access the camera')
        break
    results= model.process(frame)
    condition = np.stack((results.segmentation_mask,) * 3, axis = -1) > 0.1
    if bg_image is None:
        bg_image = np.zeros(frame.shape, dtype=np.uint8)
        bg_image[:]= (0, 255, 0)
    bg_image = cv2.resize(bg_image, (frame.shape[1], frame.shape[0]) )
    output_image = np.where(condition, frame, bg_image)
    cv2.imshow('Frame', output_image)
    m = cv2.waitKey(1)
    if m == ord('q'):
        break

cam.release()
cv2.destroyAllWindows()

