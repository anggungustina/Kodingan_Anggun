package com.anggun.chapter8.ujian;

import java.util.Scanner;

public class LetsTry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PROGRAM APLIKASI REKAP NILAI");

        System.out.println("Masukan jumlah siswa: ");
        String[] jumlahsiswa = new String[input.nextInt()];
        System.out.println("Masukan jumlah mapel: ");
        String[] jumlahmapel = new String[input.nextInt()];
        int[] nilai = new int[jumlahmapel.length];

        System.out.println("INPUT MATA PELAJARAN");
        for (int i = 0; i < jumlahmapel.length; i++) {
            System.out.println("Mata pelajaran " + (i + 1) + ": ");
            jumlahmapel[i] = input.next();
        }
        System.out.println("* INPUT SISWA DAN NILAI SETIAP MATA PELAJARAN *");
        for (int i = 0; i < jumlahsiswa.length; i++) {
            System.out.println("Nama siswa " + (i + 1) + ": ");
            jumlahsiswa[i] = input.next();
            for (int j = 0; j < nilai.length; j++) {
                System.out.println("\nNilai mata pelajaran " + jumlahmapel[j] + ": ");
                nilai[i] = input.nextInt();

            }
        }
        System.out.println("*** DATA NILAI SISWA ***");
        System.out.println("-----------------------------------------------------------------");
        System.out.format("%-3s | %-10s | %-5s|", "No", "Nama Siswa", "index", "keterangan");
        System.out.println("\n-----------------------------------------------------------------");


    }
}

