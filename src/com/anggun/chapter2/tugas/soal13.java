package com.anggun.chapter2.tugas;

import java.util.Scanner;

public class soal13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double MONTHLY_INTEREST_RATE = 0.00417;
        System.out.print("Enter the mothly saving amount: ");
        double savingAmount = input.nextDouble();

        double total = 100 * (1 + MONTHLY_INTEREST_RATE);
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        System.out.println("After the sixth month, the account value is " + total);
    }
}
