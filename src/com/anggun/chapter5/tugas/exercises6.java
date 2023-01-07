package com.anggun.chapter5.tugas;

public class exercises6 {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.609;
        System.out.println("Miles Kilometers | Kilometers  Miles ");
        for (int m = 1, k= 20; m<= 10 && k <= 65; m++, k += 5) {
            System.out.printf("%-11d%-10.3f", m, (m * KILOMETERS_PER_MILE));
            System.out.print(" | ");
            System.out.printf("%-11d%-10.3f\n", m, (m * KILOMETERS_PER_MILE));
        }
    }
}
