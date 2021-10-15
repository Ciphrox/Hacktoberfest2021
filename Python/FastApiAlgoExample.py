from fastapi import FastAPI
from typing import Optional
from pydantic import BaseModel
import time


class Data(BaseModel):
    sensor_id: str
    model: str
    payload: str

app = FastAPI()

PAD_CHAR = "#"
PAD_N = 5

def handler_trim(input):
    return input.strip()

def handler_pad(input):
    return input + (PAD_CHAR * PAD_N)


def handler_time(input):
    return input + "_" + str(int(time.time()))

def write_file(input):
    f = open('server.log', 'a')
    f.write(input)
    f.write("\n")
    f.close()

@app.post("/")
async def Transmit(data: Data):
    if data.model == "1":
        print(data.payload)
    elif data.model == "2":
        print(handler_pad(data.payload))
    elif data.model == "3":
        write_file(handler_pad(handler_trim(data.payload)))
    elif data.model == "4":
        final = handler_time(handler_pad(handler_trim(data.payload)))
        print(final)
        write_file(final)

    return data
