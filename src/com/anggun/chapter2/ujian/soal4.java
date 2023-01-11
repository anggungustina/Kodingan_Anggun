package com.anggun.chapter2.ujian;

import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan berat badan");
        double beratbadan = input.nextDouble();
        System.out.print("Masukan tinggi badan");
        double tinggibadan = input.nextDouble();

        double BMI = beratbadan / Math.pow(tinggibadan / 100, 2);
        double perempuan = (tinggibadan - 100) - (0.15 * (tinggibadan - 100));

        System.out.println("Berat badan ideal adalah " + perempuan + " BMInya adalah " + String.format("%.2f", BMI));
    }
}
