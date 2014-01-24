<?php 
// The prime factors of 13195 are 5, 7, 13 and 29.

// What is the largest prime factor of the number 600851475143 ?

function factors($n) {
	$t = [];
	for ($i=floor(sqrt($n)); $i > 0; $i--)
		if ($n % $i == 0)
			array_push($t, $i);
	return $t;
}

function isPrime($n) {
	return count(factors($n)) == 1;
}

foreach (factors(600851475143) as $factor) {
	if (isPrime($factor)) {
		echo $factor;
		break;
	}
}
