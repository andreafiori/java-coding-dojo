package com.algorithms.strings;

public class ReverseString
{
    /**
     * Reverse a string
     * 
     * @param source String
     * @return the reversed string
     */
    public static String reverse(String source) {
        if (source == null || source.isEmpty()) {
            return source;
        }

        String reverse = "";
        for (int i = source.length() - 1; i >= 0; i--) {
            reverse = reverse + source.charAt(i);
        }

        return reverse;
    }

    /**
     * Replace a String in place
     * 
     * @param input String
     * @return the reversed string
     */
    public static String inPlaceReverse(final String input) {
        final StringBuilder builder = new StringBuilder(input);
        int length = builder.length();
        for (int i = 0; i < length / 2; i++) {
            final char current = builder.charAt(i);
            final int otherEnd = length - i - 1;
            builder.setCharAt(i, builder.charAt(otherEnd)); // swap
            builder.setCharAt(otherEnd, current);
        }

        return builder.toString();
    }
}
