# Following is the implementation of RSA Encryption and Decryption Algorithm
# Input any number as plaintext
# The public and private keys change everytime as we generate random prime numbers everytime
# Eg:
# Enter message to encrypt: 234
# Public Key: e = 4205, n = 23213
# Private Key: d = 8297, n = 23213
# Ciphertext: 8005
# Decrypted Text: 234

import sympy.ntheory as nt
import random

# Finding modular multiplicative inverse
def modularInverse(e, m):
    for x in range(1, m):
        if ((e % m) * (x % m)) % m == 1:
            return x
    return -1


# Euclid's algorithm to find GCD
def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a


minPrime = 0
maxPrime = 1000
cached_primes = [i for i in range(minPrime, maxPrime) if nt.isprime(i)]

# Generate 2 random primes approximately of equal size (bits)
p = random.choice([i for i in cached_primes if 100 < i < 200])
q = random.choice([i for i in cached_primes if 100 < i < 200])

n = p * q
# Totient of n
m = (p - 1) * (q - 1)

# Choosing e, 1 < e < m such that gcd(e, m) = 1
e = random.randrange(1, m)
g = gcd(e, m)

# Verify whether gcd(e, m) = 1
while g != 1:
    e = random.randrange(1, m)
    g = gcd(e, m)

# Compute secret exponent
d = modularInverse(e, m)

publicKey = e, n
privateKey = d, n

plaintext = int(input("Enter message to encrypt: "))

print("Public Key: e = " + str(publicKey[0]) + ", n = " + str(publicKey[1]))
print("Private Key: d = " + str(privateKey[0]) + ", n = " + str(privateKey[1]))

ciphertext = int(pow(plaintext, e, n))
print("Ciphertext:", ciphertext)
decryptedText = int(pow(ciphertext, d, n))
print("Decrypted Text:", decryptedText)
