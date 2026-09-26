package com.algorithms.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {

    /**
     * Find all duplicate characters in a String and print each of them.
     * 
     * @param a map of characters
     * @return a map with duplicated characters 
     */
    public static Map<Character, Integer> findDuplicates(Map<Character, Integer> charMap) {
        Map<Character, Integer> duplicatedCharsMap = new HashMap<Character, Integer>();

        // Iterate through HashMap to print all duplicate characters of String
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                duplicatedCharsMap.put(entry.getKey(), entry.getValue());
            }
        }

        return duplicatedCharsMap;
    }
    
    /**
     * Build HashMap with character and number of times they appear in String
     * 
     * @param word
     * @return
     */
    public static Map<Character, Integer> mapWord(String word) {
        char[] characters = word.toCharArray();

        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (Character ch : characters) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        return charMap;
    }
}
