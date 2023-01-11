package com.anggun.chapter5.tugas;

public class exercises26_ComputeE {
    public static void main(String[] args) {
        double e = 0.0, value = 10000.0;
        for (double i = 1; i <= value; i++) {
            double denominator = i;
            for (double k = i - 1; k >= 1; k--) {
                denominator *= k;
            }
            e += 1 / denominator;
        }
        System.out.println("The e value for i = 10000: " + e);
        e = 0.0;
        value = 20000.0;
        for (double i = 1; i <= value; i++) {
            double denominator = i;
            for (double k = i - 1; k >= 1; k--) {
                denominator *= k;
            }
            e += 1 / denominator;
        }
        System.out.println("The e value for i = 20000: " + e);
        e = 0.0;
        value = 100000.0;
        for (double i = 1; i <= value; i++) {
            double denominator = i;
            for (double k = i - 1; k >= 1; k--) {
                denominator *= k;
            }
            e += 1 / denominator;
        }
        System.out.println("The e value for i = 100000: " + e);
    }
}
/*(Compute e) You can approximate e using the following summation:
e = 1 + 1/1! + 2/1! + 3/1! + 4/1! + ... + i/1!

 */