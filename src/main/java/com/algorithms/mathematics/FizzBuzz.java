package com.algorithms.mathematics;

public class FizzBuzz {

    /**
     * Given a number, get the related FizzBuzz value as string
     * 
     * @param i integer
     * @return String
     */
    public static String getSequence(Integer i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(i);
    }

}
