package com.algorithms.mathematics;

public class Division {

    /**
     * Division between 2 integer
     *
     * @param a first number
     * @param b second number
     * @return division result with long casting for input args
     */
    public static long division(int a, int b) {
        return ((long) a) / ((long) b);
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static long divisionUsingLoop(int a, int b) {
        int absA = Math.abs(a);
        int absB = Math.abs(b);

        long temp = absA;
        long result = 0;
        while (temp >= 0) {
            temp -= absB;
            if (temp >= 0)
                result++;
        }
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static long divisionUsingRecursion(int a, int b) {
        int absA = Math.abs(a);
        int absB = Math.abs(b);

        long result = 1;
        int diff = absA - absB;
        if (diff == 1) {
            return result;
        } else if (diff < 0) {
            return 0;
        }

        result += divisionUsingRecursion(diff, absB);
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static long divisionUsingMultiplication(int a, int b) {
        int absA = Math.abs(a);
        int absB = Math.abs(b);

        int temp = absB;
        int counter = 0;
        while (temp <= absA) {
            temp = temp << 1;
            counter++;
        }
        absA -= absB << (counter - 1);
        long result = (long) Math.pow(2, counter - 1);
        if (absB <= absA) {
            result += divisionUsingMultiplication(absA, absB);
        }
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static final long divisionUsingShift(int a, int b) {
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        int tempA, tempB, counter;

        long result = 0L;
        while (absA >= absB) {
            tempA = absA >> 1; // Right shift "a"
            tempB = absB;
            counter = 1;
            while (tempA >= tempB) { // Double "tempB" until it's larger than
                                     // "tempA"
                tempB <<= 1;
                counter <<= 1; // Double the counter
            }
            absA -= tempB; // Subtract "tempB" from "a"
            result += counter; // Add counter (2^number of left shifts)
        }
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static long divisionUsingLogs(int a, int b) {
        long absA = Math.abs(a);
        long absB = Math.abs(b);
        double logBase10A = Math.log10(absA);
        double logBase10B = Math.log10(absB);
        double powOf10 = Math.pow(10, (logBase10A - logBase10B));
        long result = (long) Math.floor(powOf10);
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }
}
