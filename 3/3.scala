
// The prime factors of 13195 are 5, 7, 13 and 29.

// What is the largest prime factor of the number 600851475143 ?

// --------------------------------------------------------------------

// This is slow because it computes primes first and factors second. Some of the other solutions do the opposite
// The opposite is better effeciency due to the relative difficulty of the two task, and the fact that there are
// a lot more primes under sqrt of 600851475143 than there are factors of 600851475143

val number = BigInt(600851475143L)
val start = math.sqrt(600851475143L).floor

lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
   ps.takeWhile{j => j * j <= i}.forall{ k => i % k > 0})

println(ps.takeWhile(_ < start.toInt).filter(number % _ == 0).toList.last)