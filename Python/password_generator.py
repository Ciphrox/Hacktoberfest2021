import random
import strings

digits = int(input("how many digits password: "))
def pas_gen(digits):
	pas = ''.join(random.choices(string.ascii_letters + string.punctuation + string.digits, k=digits))
	return pas
print(pas_gen(digits))
