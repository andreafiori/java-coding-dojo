package com.algorithms.mathematics;

import java.util.ArrayList;
import java.util.List;

public class FirstPrimeNumbers {
    /**
     * Find first n prime numbers
     * 
     * @param n int
     * @return a List of integers
     */
    public static List<Integer> findFirsts(int n) {
        int num = 3;
        int status = 0;

        List<Integer> primeNumbers = new ArrayList<Integer>();
        
        if (n >= 1) {
            primeNumbers.add(2);
        }
        
        if (n > 1) {
            primeNumbers.add(3);
        }
        
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            
            if (status != 0) {
                primeNumbers.add(num);
                i++;
            }
            
            status = 1;
            num++;
        }
        
        return primeNumbers;
    }

    /**
     * Check if a number is prime
     * 
     * @param n int
     * @return boolean
     */
    public static boolean isPrime(int n) {  
       if (n <= 1) {
           return false;
       }
       for (int i = 2; i < Math.sqrt(n); i++) {  
           if (n % i == 0) {
               return false;
           }
       }
       return true;
   }
}
