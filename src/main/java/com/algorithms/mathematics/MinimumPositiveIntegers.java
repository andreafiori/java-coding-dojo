package com.algorithms.mathematics;

/**
 * https://www.geeksforgeeks.org/minimum-product-pair-an-array-of-positive-integers/
 */
public class MinimumPositiveIntegers {
    /**
     * Function to calculate minimum product of pair
     * 
     * @param arr
     * @param n
     * @return integer
     */
    public static int findProductPair(int arr[]) {
        // Initialize first and second
        // minimums. It is assumed that the
        // array has at least two elements.
        int first_min = Math.min(arr[0], arr[1]);
        int second_min = Math.max(arr[0], arr[1]);

        // Traverse remaining array and keep
        // track of two minimum elements (Note
        // that the two minimum elements may
        // be same if minimum element appears
        // more than once)
        for (int i = 2; i < arr.length; i++) {
            
            if (arr[i] < first_min) {
                second_min = first_min;
                first_min = arr[i];
            } else if (arr[i] < second_min) {
                second_min = arr[i];
            }

        }

        return first_min * second_min;
    }
}
