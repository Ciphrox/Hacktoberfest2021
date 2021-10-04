import random
digits = int(input("how many digit password: "))
def pass_gen(digits):
	chars = "abcdefghijklmnopqrstuvwxyz1234567890"
	return "".join(random.sample(chars,digits))
print(pass_gen(digits))
