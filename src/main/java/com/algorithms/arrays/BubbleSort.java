package com.algorithms.arrays;

/**
 * Implement bubble sort algorithm and sort integer array
 */
public class BubbleSort {

    /**
     * Sort the integer array using bubble sort algorithm
     *
     * @param numbers
     * @return int[]
     */
    public static int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j] < numbers[j - 1]) {
                    swap(numbers, j, j - 1);
                }
            }
        }

        return numbers;
    }

    /**
     * An improved implementation of Bubble Sort algorithm, which will only do  pass and n-1 comparison if array is already sorted.
     *
     * @param names
     */
    public static String[] sortImproved(String[] names) {
        boolean swapped = true;
        int last = names.length - 2;

        // only continue if swapping of number has occurred
        while (swapped) {
            swapped = false;

            for (int i = 0; i <= last; i++) {
                if (names[i].compareTo(names[i + 1]) > 0) {

                    // pair is out of order, swap them
                    swapStrings(names, i, i + 1);

                    swapped = true; // swapping occurred
                }
            }

            // after each pass largest element moved to end of array
            last--;
        }

        return names;
    }

    /**
     * Swap two numbers in array
     *
     * @param array
     * @param from
     * @param to
     */
    private static void swap(int[] array, int from, int to) {
        int temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }

    /**
     * Swap strings in an array
     * 
     * @param names string
     * @param fromIdx int
     * @param toIdx int
     */
    public static void swapStrings(String[] names, int fromIdx, int toIdx) {
        String temp = names[fromIdx]; // exchange
        names[fromIdx] = names[toIdx];
        names[toIdx] = temp;
    }

}