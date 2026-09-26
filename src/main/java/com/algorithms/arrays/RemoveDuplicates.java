package com.algorithms.arrays;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    /**
     * Remove duplicated strings
     * 
     * @param array list of strings
     * @return a list of string with no duplicated elements
     */
    public static List<Object> removeFromListOfString(List<String> array) {
        return array.stream().distinct().collect(Collectors.toList());
    }
}
