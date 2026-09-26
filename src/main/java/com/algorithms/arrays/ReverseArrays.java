package com.algorithms.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrays {

    /**
     * Reverse array changing the index position
     * 
     * @param array
     * @return
     */
    public static Integer[] reverseInPlace(Integer[] array) {
        for(int i=0; i<array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = temp;
        }
        return array;
    }

    /**
     * Reverse using List, ArrayList and Collection
     * 
     * @param array
     * @return
     */
    public static String[] reverseArrayList(String[] array) {
        List<String> arrayAsList = Arrays.asList(array);
        Collections.reverse(arrayAsList);

        return arrayAsList.toArray(array);
    }

}
