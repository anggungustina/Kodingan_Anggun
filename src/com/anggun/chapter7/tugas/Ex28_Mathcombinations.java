package com.anggun.chapter7.tugas;

import java.util.Scanner;

public class Ex28_Mathcombinations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[10];

        System.out.print("Enter ten number: ");
        for (int i = 0; i < number.length; i++)
            number[i] = input.nextInt();

        printCombinations(number);
    }

    public static void printCombinations(int[] number) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (i != j)
                    System.out.println(number[i] + " " + number[j]);
            }
        }
    }
}
