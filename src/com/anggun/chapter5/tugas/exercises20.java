package com.anggun.chapter5.tugas;

public class exercises20 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES_PERLINE = 8;
        int count = 0;
        System.out.println("The prime numbers between 2 and 1,000, inclusive are \n");
        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                if (count % NUMBER_OF_PRIMES_PERLINE == 0) {
                    System.out.println(number);
                } else
                    System.out.println(number + " ");
            }
        }
    }
}
