--Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

--1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

--By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

import System.Info

fibs = 1 : 1 : zipWith (+) fibs (tail fibs)

main = do
	print (foldr (\y ys -> ys + if (y `mod` 2 == 0) then y else 0) 0 
		(takeWhile (<= 4000000) fibs))