# The prime factors of 13195 are 5, 7, 13 and 29.

# What is the largest prime factor of the number 600851475143 ?

import math

class primeFactors(object):
    def __init__(self, n):
        self.n = n
        self.nums = [i for i in self.factorize(n) if self.isPrime(i)]
        self.num = self.nums[-1]

    def __iter__(self):
        return self

    def isPrime(self, n):
        return len(self.factorize(n)) == 1

    def factorize(self, n):
        t = []
        for i in xrange(int(math.floor(math.sqrt(n))),0,-1):
            if n % i == 0:
                t.append(i)
        t.reverse()
        return t

    def next(self):
        if len(self.nums) == 0:
            raise StopIteration
        return self.nums.pop()

print primeFactors(600851475143).next()