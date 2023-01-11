package com.anggun.chapter2.tugas;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit: ");
        double celsius = input.nextDouble();

        double fahrenheit = 9.0 / 5.0 * celsius + 32;
        System.out.println("Celsius " + celsius + " is " + fahrenheit + " in fahrenheit");
    }
}
