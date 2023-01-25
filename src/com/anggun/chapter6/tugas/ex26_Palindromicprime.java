package com.anggun.chapter6.tugas;

import com.anggun.chapter6.latihan.PrimeNumberMethod;

public class ex26_Palindromicprime {
    public static void main(String[] args) {

        final int NUMBER_OF_PALINDROMIC_PRIMES = 100;
        final int NUMBERS_PER_LINE = 10;
        int count = 0;
        int n = 2;

        while (count < NUMBER_OF_PALINDROMIC_PRIMES) {
            if (isPalindromicPrime(n)) {
                count++;
                System.out.print(count % NUMBERS_PER_LINE == 0 ? n + "\n" : n + " ");
            }
            n++;
        }
    }

    public static boolean isPalindromicPrime(int num) {
        return PrimeNumberMethod.isPrime(num) &&
                Palindromeinteger.isPalindrome(num);
    }
}
