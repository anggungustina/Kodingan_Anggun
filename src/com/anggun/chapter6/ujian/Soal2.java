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
        System.out.println("5. Menghitung volume kubus ");
        System.out.println("6. Menghitung Luas permukaan kubus ");
        System.out.println("7. Menghitung Volume Limas segiempat ");
        System.out.println("8. Menghitung Luas permukaan Limas segiempat");
        System.out.println("9. Menghitung volume tabung ");
        System.out.println("10.Menghitung Luas permukaan tabung ");


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
                System.out.println("Masukan panjang: ");
                int pj = input.nextInt();
                System.out.println("Masukan lebar: ");
                int lb = input.nextInt();
                System.out.println("Masukan tinggi: ");
                int tg = input.nextInt();
                System.out.println("Luas permukaanya adalah " + LuasP(pj, lb, tg));
                break;
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
                System.out.println("Masukan alas segitiga: ");
                int als = input.nextInt();
                System.out.println("Masukan tinggi segitiga:");
                int tis = input.nextInt();
                System.out.println("Masukan tinggi prisma: ");
                int tip = input.nextInt();
                System.out.println("Masukan keliling segitiga: ");
                int kes = input.nextInt();
                System.out.println("Luas permukaannya adalah: " + Luas(als, tis, tip, kes));
                break;
            case 5:
                System.out.println("Menghitung volume kubus");
                System.out.println("Masukan sisi:  ");
                int s = input.nextInt();
                System.out.println("volumenya adalah: " + volume3(s));
                break;
            case 6:
                System.out.println("Menghitung Luas permukaan kubus");
                System.out.println("Masukan sisi: ");
                int sisi = input.nextInt();
                System.out.println("Luas permukaanya adalah: " + LuasPe(sisi));
                break;
            case 7:
                System.out.println("Menghitung Volume Limas segiempat");
                System.out.println("Masukan panjang: ");
                int pjg = input.nextInt();
                System.out.println("Masukan lebar: ");
                int lbr = input.nextInt();
                System.out.println("Masukan tinggi: ");
                int tng = input.nextInt();
                System.out.println("Volumenya adalah: " + volume4(pjg, lbr, tng));
                break;
            case 8:
                System.out.println("Menghitung Luas permukaan Limas segiempat");
                System.out.println("Masukan Luas alas: ");
                int la = input.nextInt();
                System.out.println("Masukan Luas selubung limas: ");
                int lsl = input.nextInt();
                System.out.println("Luas permukaanya adalah: " + Luasper(la, lsl));
                break;
            case 9:
                System.out.println("Menghitung volume tabung");
                System.out.println("Masukan pi: ");
                int pi = input.nextInt();
                System.out.println("Masukan jari jari: ");
                int jr = input.nextInt();
                System.out.println("Masukan tinggi: ");
                int tgg = input.nextInt();
                System.out.println("Volumnya adalah: " + volume5(pi, jr, tgg));
                break;
            case 10:
                System.out.println("Menghitung Luas permukaan tabung");
                System.out.println("Masukan pi: ");
                int PI = input.nextInt();
                System.out.println("Masukan jari jari; ");
                int r = input.nextInt();
                System.out.println("Masukan tinggi: ");
                int tinggi = input.nextInt();
                System.out.println("Luas permukaanya adalah: " + Luasperm(PI, r, tinggi));
                break;
        }
    }

    public static int volume(int p, int l, int t) {
        return p * l * t;
    }

    public static int LuasP(int pj, int lb, int tg) {
        return 2 * (pj * lb + pj * tg + lb * tg);
    }

    public static int volume2(int as, int ts, int tp) {
        return (int) (0.5 * as * ts) * tp;
    }


    public static int Luas(int als, int tis, int tip, int kes) {
        return (als * tis) + (kes * tip);
    }

    public static int volume3(int s) {
        return s * s * s;
    }

    public static int LuasPe(int sisi) {
        return 6 * sisi * sisi;
    }

    public static int volume4(int pjg, int lbr, int tng) {
        return 0;
    }

    public static int Luasper(int la, int lsl) {
        return la * lsl;
    }

    public static int volume5(int pi, int jr, int tgg) {
        return pi * jr * jr * tgg;
    }

    public static int Luasperm(int pi, int r, int tinggi) {
        return 2 * pi * r * (r + tinggi);
    }


}

