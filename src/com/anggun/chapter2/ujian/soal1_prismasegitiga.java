package com.anggun.chapter2.ujian;

import java.util.Scanner;

public class soal1_prismasegitiga {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter alas segitiga : ");
        double as = in.nextDouble();
        System.out.print("Enter tinggi segitiga : ");
        double ts = in.nextDouble();
        System.out.print("Enter tinggi prisma : ");
        double tp = in.nextDouble();
        double ks = 2 * Math.pow((Math.pow((as / 2), 2) + Math.pow(ts, 2)), 0.5) + as;
        double volume = ((0.5 * as * ts) * tp);
        double luaspermukaan = ((1 * as * ts) + (ks * tp));
        System.out.println("volume prisma segitiga sama kaki adalah " + volume + " luas permukaanya " + String.format("%.2f", luaspermukaan));
    }
}
