package com.algorithms.mathematics;

/**
 * Armstrong number
 * <a href="https://en.wikipedia.org/wiki/Narcissistic_number">Armstrong number Wiki</a>
 *
 */
public class ArmstrongNumber {
    /**
     * Check if the number is an Armstrong number
     *
     * @param n number to test
     * @return boolean
     */
    public static boolean isArmstrongNumber(int n) {
        if (n < 100) {
            return false;
        }

        int c = 0, a, temp;
        temp = n;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            c = c + (a * a * a);
        }

        return (temp == c);
    }
}
