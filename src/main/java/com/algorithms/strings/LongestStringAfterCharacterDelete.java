package com.algorithms.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * https://techdevguide.withgoogle.com/paths/foundational/find-longest-word-in-dictionary-that-subsequence-of-given-string/
 *
 * Given a string S and a set of words D, find the longest word in D that is a subsequence of S.
 *
 * Word W is a subsequence of S if some number of characters, possibly zero, can be deleted from S to form W, without reordering the remaining characters.
 *
 * Note: D can appear in any format (list, hash table, prefix tree, etc.
 *
 * For example, given the input of S = "abppplee" and D = {"able", "ale", "apple", "bale", "kangaroo"} the correct output would be "apple"
 *
 * The words "able" and "ale" are both subsequences of S, but they are shorter than "apple".
 * The word "bale" is not a subsequence of S because even though S has all the right letters, they are not in the right order.
 * The word "kangaroo" is the longest word in D, but it isn't a subsequence of S.
 */
public class LongestStringAfterCharacterDelete
{
    /**
     * FInd Longest String
     *
     * @param dict List<String>
     * @param input String
     * @return List<String>
     */
    public List<String> findLongestString(List<String> dict, String input)
    {
        String finalString = null;
        List<String> multipleLongestString = new ArrayList<String>();
        int index = 0;
        boolean isLongStringFound = false;
        for (String tempDict : dict) {

            finalString = compareString(tempDict, input);

            if (tempDict.equals(finalString)) {
                finalString = tempDict;
                if (multipleLongestString.size() == 0) {
                    multipleLongestString.add(index, finalString);
                } else if (finalString.length() > multipleLongestString.get(0)
                        .length()) {
                    isLongStringFound = true;
                }
            }

            if (finalString.length() >= multipleLongestString.get(0).length()
                    && !finalString.equals(multipleLongestString.get(0))) {
                if (isLongStringFound) {
                    multipleLongestString.remove(0);
                    isLongStringFound = false;
                }
                multipleLongestString.add(0, finalString);
                index++;
            }
        }

        return multipleLongestString;
    }

    /**
     * Compare 2 strings
     *
     * @param tempDict String
     * @param input String
     * @return String
     */
    private String compareString(String tempDict, String input)
    {
        StringBuilder sb = new StringBuilder();
        int tempCount = 0;
        int inputStringLength = input.length();
        int dictLength = 0;

        while (inputStringLength != 0) {

            if (dictLength < tempDict.length()) {
                if (input.toLowerCase().contains(
                        Character.toString(tempDict.toLowerCase().charAt(
                                tempCount)))) {

                    sb.append(tempDict.charAt(tempCount));

                    tempCount++;
                    dictLength++;
                }
            }
            inputStringLength--;
        }

        return sb.toString();
    }
}
