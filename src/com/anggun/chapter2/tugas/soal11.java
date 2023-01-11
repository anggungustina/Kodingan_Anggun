package com.anggun.chapter2.tugas;

import java.util.Scanner;

public class soal11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of years: ");
        int Years = input.nextInt();
        int population = 312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * Years);

        System.out.println(" The population in " + Years + " is " + population);
    }
}
