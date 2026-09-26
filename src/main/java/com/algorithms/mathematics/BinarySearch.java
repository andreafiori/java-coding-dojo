package com.algorithms.mathematics;

/**
 * Search a value in a list (array)
 * 
 * A binary search or half-interval search algorithm finds the position of a
 * specified value (the input "key") within a sorted array. Binary search
 * requires a sorted collection. Also, binary searching can only be applied to a
 * collection that allows random access (indexing).
 * 
 * Worst case performance: O(log n)
 * 
 * Best case performance: O(1)
 */
public class BinarySearch {
    /**
     * Check if a number is in the array list
     *
     * @param a int[]
     * @param key int
     * @return int
     */
    public static int checkElement(int[] a, int key) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (key == a[mid]) {
                return mid;
            }
            
            if (key < a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
