package com.anggun.chapter6.tugas;

import com.anggun.chapter6.latihan.PrimeNumberMethod;

public class ex27_Emirp {
    public static void main(String[] args) {
        final int NUMBER_OF_EMIRPS = 100;
        final int EMIRPS_PER_LINE = 10;

        int count = 0;
        int n = 2;

        while (count < NUMBER_OF_EMIRPS) {
            if (isEmirp(n)) {
                count++;
                System.out.print(count % EMIRPS_PER_LINE == 0 ? n + "\n" : n + " ");
            }
            n++;
        }
    }

    public static boolean isEmirp(int num) {
        return PrimeNumberMethod.isPrime(num) &&
                !Palindromeinteger.isPalindrome(num) &&
                PrimeNumberMethod.isPrime(Palindromeinteger.reverse(num));

    }
}

