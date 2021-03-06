// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
// 
// Find the sum of all the multiples of 3 or 5 below 1000.


println ((0 to 999).reduce((value, carry) => {
	if (carry % 3 == 0 || carry % 5 == 0) {
		value + carry
	} else {
		value + 0
	}
}))

// Worse effeciancy, but more idiomatic
// 2 iterations rather than 1

println ((0 to 999).filter(a => a % 3 == 0 || a % 5 == 0).sum)