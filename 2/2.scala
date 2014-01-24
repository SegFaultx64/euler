// Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

// By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

val fib: Stream[BigInt] = 1 #:: 2 #:: fib.zip(fib.tail).map(p => p._1 + p._2)

println(fib.takeWhile(_ < 4000000).filter(_  % 2 == 0).sum)