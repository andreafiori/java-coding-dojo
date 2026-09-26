package com.algorithms.mathematics;

public class LeapYear {
    /**
     * Check if it's a leap year
     * 
     * @param year
     * @return
     */
    public static Boolean isLeapYear(Integer year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
}
