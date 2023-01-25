package com.anggun.chapter6.tugas;

public class Financialapplicationcomputecommissions {
    public static void main(String[] args) {
        System.out.println("\n Salesamount        Commision");
        System.out.println("-------------------------------");
        for (double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
            System.out.printf(" %-16.0f", salesAmount);
            System.out.printf("%8.1f\n", computeCommision(salesAmount));
        }
    }

    public static double computeCommision(double salesAmount) {
        double balance, commission;
        balance = commission = 0.0;

        if (salesAmount >= 10000.01)
            commission += (balance = salesAmount - 10000) * 0.12;

        if (salesAmount >= 5000.01)
            commission += (balance -= balance - 5000) * 0.10;
        if (salesAmount >= 0.01)
            commission += balance * 0.08;
        return commission;
    }
}
