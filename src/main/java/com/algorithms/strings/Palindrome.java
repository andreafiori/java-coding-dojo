package com.algorithms.strings;

public class Palindrome {
    /**
     * Check if number is palindrome or not
     * 
     * @param number to check
     * @return boolean
     */
    public static boolean isPalindromeNumber(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means number is palindrome in Java
        if (number == reverse) {
            return true;
        }

        return false;
    }

    /**
     * Check if a string is palindrome or not
     * 
     * @param str String to check
     * @return boolean
     */
    public static boolean isPalindromeString(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
