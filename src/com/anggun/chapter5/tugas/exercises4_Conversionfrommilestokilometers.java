package com.anggun.chapter5.tugas;

public class exercises4_Conversionfrommilestokilometers {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.609;
        System.out.println("Miles Kilometers");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-13d%-10.3f%\n", i, (i * KILOMETERS_PER_MILE));
        }
    }
}
