package com.anggun.chapter6.tugas;

import java.util.Scanner;

public class Displayanintegerreversed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("(Display and integer reversed: ");
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        reverse(number);
    }

    public static void reverse(int number) {
        while (number > 0) {
            System.out.print((number % 10));
            number /= 10;
        }
        System.out.println();
    }
}
