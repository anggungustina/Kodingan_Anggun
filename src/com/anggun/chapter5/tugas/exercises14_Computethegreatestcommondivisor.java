package com.anggun.chapter5.tugas;

import java.util.Scanner;

public class exercises14_Computethegreatestcommondivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();
        int gcd = n1 < n2 ? n1 : n2;
        while (n1 % gcd != 0 || n2 % gcd != 0) {
            gcd--;
        }
        System.out.println("The greatesr common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
}
