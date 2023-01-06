package com.anggun.chapter3.tugas;

import java.util.Arrays;
import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);
        System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
        int answer = input.nextInt();

    }
}
