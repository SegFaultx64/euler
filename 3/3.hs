-- The prime factors of 13195 are 5, 7, 13 and 29.

-- What is the largest prime factor of the number 600851475143 ?

import System.Info
import Data.List (find)

factors n = [i | i <-[1..floor (sqrt (fromIntegral(n)))], (mod n i) == 0]

isPrime n = length (factors(n)) < 2

main = do
	print (find isPrime (reverse (factors(600851475143))))