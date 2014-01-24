// The prime factors of 13195 are 5, 7, 13 and 29.

// What is the largest prime factor of the number 600851475143 ?

package main
import "fmt"
import "math"

func generateFactors(n int) chan int {
    c := make(chan int)
    go func () {
        for i := int(math.Floor(math.Sqrt(float64(n)))); i >= 1; i-- {
            if n % i == 0 { c <- i }
        }
        close(c)
    }()
    return c
}

func isPrime(n int) bool {
    prime := true
    for i := range generateFactors(n) {
        if i != 1 { prime = false }
    }
    return prime
}

func main() {
    for i := range generateFactors(600851475143) {
        if isPrime(i) { fmt.Println(i); break }
    }
}