# Python program to print all
# primes smaller than or equal to
# n using Sieve of Eratosthenes


def SieveOfEratosthenes(n):

	
	prime = [True for i in range(n+1)]
	p = 2
	while (p * p <= n):

		# If prime[p] is not
		# changed, then it is a prime
		if (prime[p] == True):

			
			for i in range(p * p, n+1, p):
				prime[i] = False
		p += 1

	
	for p in range(2, n+1):
		if prime[p]:
			print p,



if __name__ == '__main__':
	n = 30
	print "Following are the prime numbers smaller",
	print "than or equal to", n
	SieveOfEratosthenes(n)
