package com.anggun.chapter6.tugas;

import com.anggun.chapter6.latihan.PrimeNumberMethod;

public class ex29_Twinprimes {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        for (int p = 2; p < 1000; p++) {
            if (isTwinprime(p))
                System.out.println("(" + p + ", " + (p + 2) + ")");
        }
    }

    public static boolean isTwinprime(int num) {
        return PrimeNumberMethod.isPrime(num) && PrimeNumberMethod.isPrime(num + 2);

    }

}
