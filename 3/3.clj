; The prime factors of 13195 are 5, 7, 13 and 29.

; What is the largest prime factor of the number 600851475143 ?

(defn factors
	[x]
    (filter
    	(fn [y]
    		(= (mod x y) 0))
    	(range (int (Math/floor (Math/sqrt x))) 0 -1)))

(defn prime?
	[x]
	(=  1
		(count
			(factors x))))

(println (first (filter prime? (factors 600851475143))))