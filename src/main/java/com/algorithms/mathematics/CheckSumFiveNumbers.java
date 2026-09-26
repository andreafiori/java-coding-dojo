package com.algorithms.mathematics;

/**
 * Number expressed as sum of five consecutive integers
 * 
 * Given an integer n, the task is to find whether n can be expressed as sum of
 * five consecutive integer. If yes, find the five consecutive integers, else
 * return "-1" in a list.
 * 
 * <a href="https://www.geeksforgeeks.org/number-expressed-sum-five-consecutive-integers/">Source</a>
 *
 */
public class CheckSumFiveNumbers {

    /**
     * Brute Force Method
     * 
     * @param n input number
     * @return a list with valid numbers or a list with -1
     */
    public static int[] bruteForce(int n) {
        if (n == 0) {
            int[] list = { -2, -1, 0, 1, 2 };
            return list;
        }

        int inc;

        // if n is positive, increment loop by 1.
        if (n > 0)
            inc = 1;

        // if n is negative, decrement loop by 1.
        else
            inc = -1;

        // Running loop from 0 to n - 4
        for (int i = 0; i <= n - 4; i += inc) {

            // check if sum of five consecutive integer is equal to n.
            if (i + i + 1 + i + 2 + i + 3 + i + 4 == n) {

                int[] list = { i, i + 1, i + 2, i + 3, i + 4 };

                return list;
            }
        }

        int[] list = { -1 };
        return list;
    }
    
    /**
     * Efficient approach
     * 
     * @param n input number
     * @return
     */
    public static int[] efficientApproach(int n) {
        if (n == 0) {
            int[] list = { -2, -1, 0, 1, 2 };
            return list;
        } else if (n % 5 == 0) {
            // if n is multiple of 5
            int[] list = { n / 5 - 2, n / 5 - 1, n / 5, n / 5 + 1, n / 5 + 2 };
            return list;
        } else {
            // return list with -1 only
            int[] list = { -1 };
            return list;
        }
    }
}
