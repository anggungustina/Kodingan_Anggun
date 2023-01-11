package com.anggun.chapter2.ujian;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double rupiahsperdollars = 15.66550;
        System.out.println("Enter a number rupiah : ");
        double rupiahs = input.nextDouble();
        double dollars = rupiahs / rupiahsperdollars;
        System.out.println(rupiahs + "rupiahs adalah $" + String.format("%.2f", dollars));
    }
}
