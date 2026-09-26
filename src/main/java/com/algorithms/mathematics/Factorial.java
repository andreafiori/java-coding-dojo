package com.algorithms.mathematics;

public class Factorial {
    /**
     * Find factorial of a number using recursion
     * 
     * @param number int
     * @return factorial of number
     */
    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    /**
     * Calculate factorial using while loop or iteration
     * 
     * @param number int
     * @return factorial of number
     */
    public static int fact(int number) {
        int result = 1;
        while (number != 0) {
            result = result * number;
            number--;
        }

        return result;
    }

}
