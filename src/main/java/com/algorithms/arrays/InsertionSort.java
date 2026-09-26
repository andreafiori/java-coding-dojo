package com.algorithms.arrays;

public class InsertionSort {
    /**
     * Sort given integer array using Insertion sort algorithm. only good for small arrays.
     * 
     * @param unsorted
     * @return
     */
    public static int[] sort(int[] unsorted) {
        for (int i = 1; i < unsorted.length; i++) {
            int current = unsorted[i];
            int j = i;

            // create right place by moving elements
            while (j > 0 && unsorted[j - 1] > current) {

                // move
                unsorted[j] = unsorted[j - 1];
                j--;
            }

            // found the right place, insert now
            unsorted[j] = current;
        }
        
        return unsorted;
    }
}
