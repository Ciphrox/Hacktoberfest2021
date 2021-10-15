import cv2
import face_recognition
import numpy as np

iu = face_recognition.load_image_file('OpenCV\images\IU.png')
iu_encodings = face_recognition.face_encodings(iu)[0]

shirley = face_recognition.load_image_file('OpenCV\images\Shirley.png')
shirley_encodings = face_recognition.face_encodings(shirley)[0]

chris = face_recognition.load_image_file('OpenCV\images\chris.png')
chris_encodings = face_recognition.face_encodings(chris)[0]


known_face_encodings = [
    iu_encodings,
    shirley_encodings,
    chris_encodings,
]

known_face_names = [
    "IU",
    "Shirley",
    "Chris",
]

cam = cv2.VideoCapture(0)

while True:
    flag, frame = cam.read()
    if not flag:
        print('Could not access the camera')
        break
    small_frame = cv2.resize(frame, (0, 0), fx = 1/4, fy = 1/4)
    rgb_frame = cv2.cvtColor(small_frame, cv2.COLOR_BGR2RGB)
    face_locations = face_recognition.face_locations(rgb_frame)
    face_encodings = face_recognition.face_encodings(rgb_frame, face_locations)

    face_names = []
    for face_encoding in face_encodings:
        matches = face_recognition.compare_faces(known_face_encodings, face_encoding)
        name ="Who are you?"
        face_distances = face_recognition.face_distance(known_face_encodings, face_encoding)
        best_match = np.argmin(face_distances)
        if matches[best_match]:
            name = known_face_names[best_match]
        face_names.append(name)

    
    for (top, right, bottom, left), name in zip(face_locations, face_names):
        top *= 4
        right *= 4
        bottom *= 4
        left *= 4

        cv2.rectangle(frame, (left, top), (right, bottom), (0, 0, 255), 2)
		
        cv2.rectangle(frame, (left, bottom - 35), (right, bottom), 
        (0, 0, 255), cv2.FILLED)

        font = cv2.FONT_HERSHEY_DUPLEX
        cv2.putText(frame, name, (left + 6, bottom - 6), font, 0.6, 
        (255, 255, 255), 1)

    cv2.imshow("Frame",frame)
    if cv2.waitKey(1) & 0xff == ord('q'):
	    break


cam.release()
cv2.destroyAllWindows()