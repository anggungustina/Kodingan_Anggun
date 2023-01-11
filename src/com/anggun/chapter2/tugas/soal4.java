package com.anggun.chapter2.tugas;

import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PoundsPerKilograms = 0.454;
        System.out.println("Enter a number in pounds: ");
        double pounds = input.nextDouble();
        double kilograms = pounds * PoundsPerKilograms;
        System.out.println("pounds " + pounds + " is " + kilograms + " kilograms ");
    }
}
