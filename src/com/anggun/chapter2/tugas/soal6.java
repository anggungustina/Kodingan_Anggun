package com.anggun.chapter2.tugas;

import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int lessThan10 = number % 10;
        number /= 10;
        int tens = number % 10;
        number /= 10;
        int hundreds = number % 10;
        number /= 10;
        int sum = hundreds + tens + lessThan10;

        System.out.println("the sum of the digits is " + sum);
    }
}
