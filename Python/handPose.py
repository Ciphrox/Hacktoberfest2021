import cv2
import mediapipe as mp

mp_drawing = mp.solutions.drawing_utils
mp_hands = mp.solutions.hands
model = mp_hands.Hands( min_detection_confidence=0.5, min_tracking_confidence=0.5)

cam =  cv2.VideoCapture(0)

while True:
    flag, frame = cam.read()
    if not flag:
        print('Could not access the camera')
        break
    results = model.process(frame)
    if results.multi_hand_landmarks:
        for landmark in results.multi_hand_landmarks:
            mp_drawing.draw_landmarks(frame, landmark, mp_hands.HAND_CONNECTIONS)
            # print(results.multi_hand_landmarks)
    cv2.imshow('Frame', frame)
    m = cv2.waitKey(1)
    if m == ord('q'):
        break

cam.release()
cv2.destroyAllWindows()
