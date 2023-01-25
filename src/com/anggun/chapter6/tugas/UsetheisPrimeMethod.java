package com.anggun.chapter6.tugas;

import com.anggun.chapter6.latihan.PrimeNumberMethod;

public class UsetheisPrimeMethod {
    public static void main(String[] args) {
        int numberOfPrimes = 0;

        for (int i = 1; i < 1000; i++) {
            if (PrimeNumberMethod.isPrime(i))
                numberOfPrimes++;
        }
        System.out.println("The number of prime numbers less than 10000: " + numberOfPrimes);
    }
}
