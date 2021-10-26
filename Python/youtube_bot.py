from selenium import webdriver as wb
from selenium.webdriver.common.keys import Keys
import pyautogui 
import time
import pyttsx3
import speech_recognition as sr
from selenium.webdriver.chrome.options import Options;

engine = pyttsx3.init()
voices = engine.getProperty("voices")
engine.setProperty('rate', 150)

def speak(audio):
    engine.say(audio)
    engine.runAndWait()

def take_command():
    r = sr.Recognizer()
    with sr.Microphone() as source:
        r.adjust_for_ambient_noise(source)
        print("Listening...")
        audio = r.listen(source)

    try:
        print("Recognizing...")
        query = r.recognize_google(audio, language="en=US")
        print(query)
    except Exception as e:
        print(e)
        speak("Cannot able to recognize, please say that again...")
        return "None"

    return query


speak('say the name of video?')
title = take_command()
brave_path = "C:/Program Files/BraveSoftware/Brave-Browser/Application/brave.exe"
option = wb.ChromeOptions()
option.binary_location = brave_path
browser = wb.Chrome(chrome_options=option)
browser.get('https://www.youtube.com/')
browser.maximize_window()
searchBar = browser.find_element_by_css_selector('#search')
searchBar.send_keys(title)
searchBar.send_keys(Keys.RETURN)
time.sleep(3)
pyautogui.click(x = 635, y = 354)   