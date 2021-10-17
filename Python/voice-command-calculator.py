import operator
import speech_recognition as s_r
print("Your speech_recognition version is: "+s_r.__version__)
r = s_r.Recognizer()
my_mic_device = s_r.Microphone(device_index=1)
with my_mic_device as source:
    print("Say What you want me to Calculate, example: 2 plus 2")
    r.adjust_for_ambient_noise(source)
    audio = r.listen(source)
my_string=r.recognize_google(audio)
print(my_string)
def get_operator_fn(op):
    return {
        '+' : operator.add,
        '-' : operator.sub,
        'x' : operator.mul,
        'divided' :operator.__truediv__,
        'divided by' :operator.__truediv__,
        'divide' :operator.__truediv__,
        'Divided' :operator.__truediv__,
        'Divided by' :operator.__truediv__,
        'Divide' :operator.__truediv__,
        'Mod' : operator.mod,
        'mod' : operator.mod,
        '^' : operator.xor,
        }[op]

def eval_binary_expr(op1, oper, op2):
    op1,op2 = int(op1), int(op2)
    return get_operator_fn(oper)(op1, op2)

print(eval_binary_expr(*(my_string.split())))
