package com.anggun.chapter6.ujian;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====================MENU====================");
        System.out.println("1.konversi bilangan biner    ke oktal");
        System.out.println("2.konversi bilangan biner    ke desimal");
        System.out.println("3.konversi bilangan biner    ke heksa");
        System.out.println("4.konversi bilangan oktal    ke biner");
        System.out.println("5.konversi bilangan oktal    ke desimal");
        System.out.println("6.konversi bilangan oktal    ke heksa");
        System.out.println("7.konversi bilangan desimal  ke biner");
        System.out.println("8.konversi bilangan desimal  ke oktal");
        System.out.println("9.konversi bilangan desimal  ke heksa");
        System.out.println("10.konversi bilangan heksa   ke biner");
        System.out.println("11.konversi bilangan heksa   ke oktal");
        System.out.println("12.konversi bilangan heksa   ke desimal");

        System.out.println("Masukan Menu yang Anda Pilih: ");
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.println("konversi bilangan biner ke oktal");
                System.out.println("Masukan bilangan biner: ");
                System.out.println("konversi bilangan biner ke oktal adalah " + oktal());
                break;

            case 2:
                System.out.println("konversi bilangan biner ke desimal");
                System.out.print("\nMasukan bilangan biner: ");
                int bilanganBiner = input.nextInt();
                int bilanganDesimal = 0;
                int i = 1;
                int angka;
                System.out.println("angka desimal dari biner " + bilanganBiner);
                while (bilanganBiner != 0) {
                    angka = bilanganBiner % 10;
                    bilanganBiner = bilanganBiner / 10;
                }
                System.out.println(" adalah : " + bilanganDesimal);
                break;

            case 3:
                System.out.println("konversi bilangan biner ke heksa ");
                System.out.println("Masukan bilangan biner: ");
                System.out.println("konversi bilangan biner ke heksa adalah " + heksa1());
                break;

            case 4:
                System.out.println("konversi bilangan oktal ke biner");
                System.out.println("Masukan bilangan oktal: ");
                System.out.println("konversi bilangan oktal ke biner adalah " + biner2());
                break;
            case 5:
                System.out.println("konversi bilangan oktal ke desimal");
                System.out.println("Masukan bilangan oktal: ");
                int AngkaOktal = input.nextInt();
                int des = 0;
                int p = 1;
                int digit;
                System.out.println("Konversi bilangan oktal ke desimal adalah " + AngkaOktal);
                while (AngkaOktal != 0) {
                    digit = AngkaOktal % 10;
                    des = des + (digit * p);
                    p = p * 8;
                    AngkaOktal = AngkaOktal / 10;
                }
                System.out.println(" adalah : " + des);
                break;
            case 6:
                System.out.println("konversi bilangan oktal ke heksa");
                System.out.println("Masukan bilangan oktal: ");
                System.out.println("konversi bilangan oktal ke heksa adalah " + heksa6());
                break;
            case 7:
                System.out.print("konversi bilangan desimal ke biner");
                System.out.print("\nMasukan bilangan desimal: ");
                int desimal = input.nextInt();
                String biner5 = " ";
                for (int d = desimal; d > 0; d /= 2) {
                    biner5 = (d % 2) + biner5;
                }
                System.out.println("Konversi bilangan desimal ke biner " + desimal + " adalah : " + biner5);
                break;
            case 8:
                System.out.print("konversi bilangan desimal ke oktal");
                System.out.print("\nMasukan bilangan desimal: ");
                int desimall = input.nextInt();
                String octal = " ";
                for (int e = desimall; e > 0; e /= 8) {
                    octal = e % 8 + octal;
                }
                System.out.println("Konversi bilangan desimal ke oktal " + desimall + " adalah : " + octal);
            case 9:
                System.out.print("konversi bilangan desimal ke heksa");
                System.out.print("\nMasukan bilangan desimal: ");
                System.out.println("Konversi bilangan desimal ke heksa adalah : " + heksa());
            case 10:
                System.out.println("Konversi bilangan heksa ke biner");
                System.out.println("Masukan bilangan heksa: ");
                System.out.println("Konversi bilangan heksa ke biner adalah " + biner());
                break;
            case 11:
                System.out.println("Konversi bilangan heksa ke oktal");
                System.out.println("Masukan bilangan heksa: ");
                Scanner scan11 = new Scanner(System.in);
                int num11 = Integer.parseInt(scan11.nextLine(), 16);
                String heksa11 = Integer.toOctalString(num11);
                System.out.println("Konversi bilangan heksa ke oktal adalah " + heksa11);
                break;
            case 12:
                System.out.println("Konversi bilangan heksa ke desimal");
                System.out.println("Masukan bilangan heksa: ");
                Scanner scan12 = new Scanner(System.in);
                int num12 = Integer.parseInt(scan12.nextLine(), 16);
                String heksa12 = Integer.toString(num12);
                System.out.println("Konversi bilangan heksa ke desimal adalah " + heksa12);
        }
    }

    //1
    public static int oktal() {
        Scanner scan6 = new Scanner(System.in);
        return Integer.parseInt(scan6.nextLine(), 2);
    }


    //3
    public static int heksa1() {
        Scanner scan1 = new Scanner(System.in);
        return Integer.parseInt(scan1.nextLine(), 2);
    }

    //4
    public static int biner2() {
        Scanner scan5 = new Scanner(System.in);
        return Integer.parseInt(scan5.nextLine(), 8);
    }


    //6
    public static int heksa6() {
        Scanner scan7 = new Scanner(System.in);
        return Integer.parseInt(scan7.nextLine(), 8);
    }


    //9
    public static int heksa() {
        Scanner scan = new Scanner(System.in);
        return Integer.parseInt(scan.nextLine(), 10);
    }

    public static int biner() {
        Scanner scan2 = new Scanner(System.in);
        return Integer.parseInt(scan2.nextLine(), 16);
    }

}


