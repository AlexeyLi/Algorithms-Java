package Algorithms;

public class PrimeNumber {

    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Time: O(sqrt(n))
    // Memory: O(1)
}
