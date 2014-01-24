// The prime factors of 13195 are 5, 7, 13 and 29.

// What is the largest prime factor of the number 600851475143 ?

println ((Math.floor(Math.sqrt(600851475143L))..0)
			 .findAll {x -> 600851475143L % x == 0}
			 .find { x -> (2..Math.sqrt(x)).every { x % it != 0 } })

