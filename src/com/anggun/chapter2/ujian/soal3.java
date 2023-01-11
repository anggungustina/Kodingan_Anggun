package com.anggun.chapter2.ujian;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number  between 1000 and 9999");
        int number = input.nextInt();
        int lessthan10 = number % 10;
        number /= 10;
        int tens = number % 10;
        number /= 10;
        int hundreds = number % 10;
        number /= 10;
        int thousand = number % 10;
        number /= 10;
        int sum = thousand + hundreds + tens + lessthan10;
        System.out.println("The sum of the digits is " + sum);

    }
}
