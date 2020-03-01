package com.algorithms.arrays;

/**
 * Java Program sort numbers using QuickSort Algorithm. QuickSort is a divide
 * and conquer algorithm, which divides the original list, sort it and then
 * merge it to create sorted output.
 * 
 */
public class QuickSort {

    private int input[];
    private int length;

    public void sort(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            return;
        }
        
        this.input = numbers;

        length = numbers.length;
        
        quickSort(0, length - 1);
    }

    /**
     * This method implements in-place quicksort algorithm recursively.
     * 
     * @param low
     * @param high
     */
    private void quickSort(int low, int high) {
        int i = low;
        int j = high;

        // pivot is middle index
        int pivot = input[low + (high - low) / 2];

        // Divide into two arrays
        while (i <= j) {
            /**
             * As shown in above image, In each iteration, we will identify a number from
             * left side which is greater then the pivot value, and a number from right side
             * which is less then the pivot value. Once search is complete, we can swap both
             * numbers.
             */
            while (input[i] < pivot) {
                i++;
            }
            while (input[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                // move index to next position on both sides
                i++;
                j--;
            }
        }

        // calls quickSort() method recursively
        if (low < j) {
            quickSort(low, j);
        }

        if (i < high) {
            quickSort(i, high);
        }
    }

    /**
     * Swap array elements
     * 
     * @param i
     * @param j
     * 
     * @return input
     */
    private int[] swap(int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
        return input;
    }
}
