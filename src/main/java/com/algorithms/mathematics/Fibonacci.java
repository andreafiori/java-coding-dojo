package com.algorithms.mathematics;

/**
 * Fibonacci numbers class.
 */
public class Fibonacci {
    /**
     * Calculate the Fibonacci number of the given integer.
     *
     * @param n int
     * @return Fibonacci number.
     * @throws IllegalArgumentException if n is < 0.
     */
    public static int fibonacciNumber(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("the number must be >= 0");
        } else if (n < 2) {
            return n;
        }

        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }

    /**
     * Check if number belongs to Fibonacci sequence
     * 
     * @param n int
     * @return boolean
     */
    public static boolean isOnFibonacciSequence(int n) {
        int fib1 = 0;
        int fib2 = 1;
        do {
            int saveFib1 = fib1;
            fib1 = fib2;
            fib2 = saveFib1 + fib2;
        } while (fib2 < n);

        return (fib2 == n);
    }
}