package com.anggun.chapter5.tugas;

import java.util.Scanner;

public class exercises17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();


        for (int rows = 1; rows <= numberOfLines; rows++) {
            for (int s = numberOfLines - rows; s >= 1; s--) {
                System.out.print("  ");
            }
            for (int i = rows; i >= 2; i--) {
                System.out.print(i + " ");
            }
            for (int r = 1; r <= rows; r++) {
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }
}
