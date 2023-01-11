package com.anggun.chapter5.tugas;

public class exercises35_summation {
    public static void main(String[] args) {
        double summation = 0.0;
        for (double i = 1.0; i <= 624; i++) {
            summation += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
        }
        System.out.println("Summation: " + summation);
    }
}
/*(Summation) Write a program to compute the following summation:
1 /1 + 22 + 22 +1 23 + 23 +1 24 + c + 2624 +1 2625

 */