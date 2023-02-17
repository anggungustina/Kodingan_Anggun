package com.anggun.chapter8.ujian;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Aplikasi Rekap nilai");

        System.out.println("Masukan jumlah siswa: ");
        int jumlahsiswa = input.nextInt();
        System.out.println("Masukan jumlah mata pelajaran: ");
        int matapelajaran = input.nextInt();

        System.out.println("* INPUT MATA PELAJARAN *");
        System.out.println("Masukan Mata Pelajaran 1: ");
        String mataPelajaran1 = input.next();
        System.out.println("Masukan Mata Pelajaran 2: ");
        String mataPelajaran2 = input.next();
        System.out.println("Masukan Mata Pelajaran 3: ");
        String mataPelajaran3 = input.next();
        System.out.println("Masukan Mata Pelajaran 4: ");
        String mataPelajaran4 = input.next();
        System.out.println("Masukan Mata Pelajaran 5: ");
        String mataPelajaran5 = input.next();

        System.out.println("* INPUT SISWA DAN NILAI SETIAP MATA PELAJARAN *");
        System.out.print("Masukan nomer siswa: ");
        String[] namasiswa = new String[input.nextInt()];
        String[] mataPelajaran = new String[namasiswa.length];
        for (int i = 0; i < namasiswa.length; i++) {
            System.out.println("Nama siswa " + (i + 1) + ": ");
            namasiswa[i] = input.next();
            System.out.print("Mata pelajaran " + (i + 1) + ": ");
            mataPelajaran[i] = input.next();
        }


        System.out.println("---------------------------------------------------------------");
        System.out.println("\t| nama siswa\t| matematika\t| fisika\t| kimia\t| Biologi\t | B.inggris\t\t");
        System.out.println("---------------------------------------------------------------");


    }
//    public static int index(int nilai, int index) {
//        if (nilai > 80) {
//            index = 'A';
//        }else if (nilai <= 80) {
//            index = 'B';
//        } else if (nilai <= 70) {
//            index = 'C';
//        } else if (nilai )
//    }
}
