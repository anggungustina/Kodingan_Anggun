package com.anggun.chapter6.ujian;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Rev4 {
    static SimpleDateFormat monthFormat = new SimpleDateFormat("MMM");
    static SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    static Date date = new Date();
    static String bulan = monthFormat.format(date);
    static String tahun = yearFormat.format(date);

    public static void main(String[] args) {
        System.out.println("Aplikasi Penggajihan Karyawan");

        Scanner input = new Scanner(System.in);

        System.out.println("Nama Karyawan: ");
        String namaKaryawan = input.next();

        System.out.println("Status Pernikahan: ");
        String statusPernikahan = input.next();

        System.out.println("Jumlah Anak: ");
        int jumlahAnak = input.nextInt();

        System.out.println("jarak Rumah ke Kantor(KM): ");
        int jarak = input.nextInt();

        System.out.println("Jumlah Hari Masuk Kerja: ");
        int hariKerja = input.nextInt();

        System.out.println("Tahun Masuk Bekerja: ");
        int tahunMasuk = input.nextInt();

        System.out.println("Gaji pokok: ");
        int gajiPokok = input.nextInt();

        int tKeluarga = tunjanganKeluarga(gajiPokok, statusPernikahan, jumlahAnak);
        int tTransport = tunjanganTransportasi(hariKerja, jarak);
        int tKesehatan = tunjanganKesehatan(tahunMasuk);

        int totalGaji = gajiPokok + tKeluarga + tTransport + tKesehatan;


        System.out.println("--------------------------------------------------------------");
        System.out.println("     Slip gaji karyawan bulan " + bulan + " " + tahun);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Nama Karyawan        : " + namaKaryawan);
        System.out.println("Status               : " + statusPernikahan);
        System.out.println("Jumlah Anak          : " + jumlahAnak);
        System.out.println("jarak Rumah ke Kantor: " + jarak);
        System.out.println("Jumlah Masuk Kerja   : " + hariKerja);
        System.out.println("Tahun Masuk          : " + tahunMasuk);
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------");
        System.out.println("\t| Gaji Pokok\t| tT.Keluargha\t| tT.Transport\t| tT.Kesehatan\t|\t");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("\t|\t%,d\t|\t%,d\t\t|\t%,d\t\t|\t%,d\t\t|\n", gajiPokok, tKeluarga, tTransport, tKesehatan);
        System.out.println("---------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Total gaji bulan " + bulan + " : " + totalGaji);
    }

    private static int tunjanganKeluarga(int gajiPoko, String statusPernikahan, int jumlahAnak) {
        double tunjanganKeluarga = 0;

        statusPernikahan = statusPernikahan.toLowerCase();

        if (statusPernikahan.equals("menikah") && jumlahAnak == 0) {
            tunjanganKeluarga = gajiPoko * 0.05;
        } else if (statusPernikahan.equals("menikah") && jumlahAnak <= 3) {
            tunjanganKeluarga = gajiPoko * 0.075;
        } else if (statusPernikahan.equals("menikah")) {
            tunjanganKeluarga = gajiPoko * 0.1;
        } else if (statusPernikahan.equals("duda") && jumlahAnak > 0) {
            tunjanganKeluarga = gajiPoko * 0.05;
        } else if (statusPernikahan.equals("duda") && jumlahAnak == 0) {
            tunjanganKeluarga = gajiPoko * 0.03;
        } else if (statusPernikahan.equals("janda") && jumlahAnak > 0) {
            tunjanganKeluarga = gajiPoko * 0.075;
        } else if (statusPernikahan.equals("janda") && jumlahAnak == 0) {
            tunjanganKeluarga = gajiPoko * 0.05;
        } else {
            System.out.println("error");
        }
        return (int) tunjanganKeluarga;
    }

    private static int tunjanganTransportasi(int jumlahHari, int jarak) {
        double tunjanganTransportasi;

        if (jarak < 5) {
            tunjanganTransportasi = jumlahHari * 5_000;
        } else if (jarak <= 10) {
            tunjanganTransportasi = jumlahHari * 10_000;
        } else {
            tunjanganTransportasi = jumlahHari * 15_000;
        }
        return (int) tunjanganTransportasi;
    }

    private static int tunjanganKesehatan(int tahunMasuk) {
        int tahunIni = Integer.parseInt(tahun);
        int tunjanganKesehatan = 0;
        int lamaBekerja = tahunIni - tahunMasuk;

        if (lamaBekerja < 2) {
            tunjanganKesehatan = 200_000;
        } else if (lamaBekerja < 5) {
            tunjanganKesehatan = 500_000;
        } else if (lamaBekerja > 5) {
            tunjanganKesehatan = 750_000;
        } else {
            System.out.println("error");
        }
        return tunjanganKesehatan;
    }
}

