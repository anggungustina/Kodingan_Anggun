package com.anggun.chapter6.ujian;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("============Menu=============");
        System.out.println("1. Menghitung volume balok ");
        System.out.println("2. Menghitung Luas permukaan balok ");
        System.out.println("3. Menghitung volume prisma segitiga");
        System.out.println("4. Menghitung Luas permukaan prisma segitiga");


        System.out.println("Masukan Menu yang Anda Pilih: ");
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.println(" Menghitung volume balok ");
                System.out.println("Masukan panjang: ");
                int p = input.nextInt();
                System.out.println("Masukan lebar: ");
                int l = input.nextInt();
                System.out.println("Masukan Tinggi: ");
                int t = input.nextInt();
                System.out.println("volumenya adalah " + volume(p, l, t));
                break;
            case 2:
                System.out.println("Menghitung Luas permukaan balok");
                System.out.println("Masukan ");
            case 3:
                System.out.println("Menghitung volume prisma segitiga");
                System.out.println("masukan alas segitiga: ");
                int as = input.nextInt();
                System.out.println("Masukan tinggi segitiga:");
                int ts = input.nextInt();
                System.out.println("Masukan tinggi prisma: ");
                int tp = input.nextInt();
                System.out.println("Volumenya adalah " + volume2(as, ts, tp));
                break;
            case 4:
                System.out.println("Menghitung Luas permukaan prisma segitiga");
                System.out.println("masukan alas segitiga: ");
                int als = input.nextInt();
                System.out.println("Masukan tinggi segitiga:");
                int tis = input.nextInt();
                System.out.println("Masukan tinggi prisma: ");
                int tip = input.nextInt();
                System.out.println("Masukan keliling segitiga: ");
                int kes = input.nextInt();
                System.out.println("Luas permukaannya adalah: " + Luas(als, tis, tip, kes));
                break;
        }
    }

    public static int volume(int p, int l, int t) {
        return p * l * t;
    }

    public static int volume2(int as, int ts, int tp) {
        return (int) (0.5 * as * ts) * tp;
    }


    public static int Luas(int als, int tis, int tip, int kes) {
        return (als * tis) + (kes * tip);
    }

}

