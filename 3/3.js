// The prime factors of 13195 are 5, 7, 13 and 29.

// What is the largest prime factor of the number 600851475143 ?

var number = 600851475143
var start = Math.floor(Math.sqrt(600851475143))
var prime = true;

for (var i = start; i >= 1; i--) {
	if (number % i == 0) {
		prime = true;
		for (var j = Math.floor(Math.sqrt(i)); j >= 2; j--) {
			if (i % j == 0) {
				prime = false;
				break;
			}
		};
		if (prime) {
			console.log(i);
			break;
		};
	};
};
