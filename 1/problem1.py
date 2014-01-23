# If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
# 
# Find the sum of all the multiples of 3 or 5 below 1000.

# This is off by one, not sure why

sum = 0
for x in xrange(1, 999):
	sum = sum + (x if x % 3 == 0 or x % 5 == 0 else 0)
print sum