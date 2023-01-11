package com.anggun.chapter2.tugas;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double MetersPerFoot = 0.305;
        System.out.print(" Enter a value for fest");
        double feet = input.nextDouble();
        double meters = feet * MetersPerFoot;
        System.out.println(+feet + " feet is " + meters + " meters is ");
    }
}
