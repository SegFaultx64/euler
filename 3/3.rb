# The prime factors of 13195 are 5, 7, 13 and 29.

# What is the largest prime factor of the number 600851475143 ?

puts Math.sqrt(600_851_475_143).floor().downto(1)
	.find_all { |e| 600_851_475_143 % e == 0 }
	.find{ |e| Math.sqrt(e).floor().downto(2).find_all{ |i| e % i == 0 } == [] }

