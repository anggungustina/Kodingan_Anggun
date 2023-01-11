package com.anggun.chapter5.tugas;

import java.util.Scanner;

public class exercises21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        System.out.println("Interest Rate Monthly Payment Total Payment");
        for (double i = 5.0; i <= 8; i += 0.125) {
            System.out.printf("%-5.3f", i);
            System.out.print("%       ");
            double montlhyInterestRate = i / 1200;
            double montlhyPayment = loanAmount * montlhyInterestRate / (1 - 1 / Math.pow(1 + montlhyInterestRate, numberOfYears * 12));
            System.out.printf("%-19.2f", montlhyPayment);
            System.out.printf("%-8.2f\n", (montlhyInterestRate * 12) * numberOfYears);
        }

    }
}
