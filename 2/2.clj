; Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

; 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

; By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

(def fib-seq
     (lazy-cat [0 1] (map + (rest fib-seq) fib-seq)))

(println 
	(reduce
		+
		(filter 
			(fn [x]
				(even? x))
			(take-while (fn [n] (<= n 4000000)) fib-seq))))