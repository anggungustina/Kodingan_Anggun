package com.anggun.chapter3.ujian;
import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double jasa=0, komisi=0, penjualan=0, pendapatan=0 ;
        System.out.println("Nama Sales: ");
        String nama = input.nextLine();
        System.out.println("Masukan jumlah penjualan Sales hari ini: ");
        penjualan = input.nextDouble();
        System.out.println(" ========================================================================== ");

        if (penjualan <=200000){
            jasa = 10000 ;
            komisi = 0.1 * penjualan ;
        } else if ( penjualan <=500000){
            jasa = 20000 ;
            komisi = 0.15 * penjualan;
        } else if (penjualan >=500000) {
            jasa = 30000;
            komisi = 0.20 * penjualan;
        } else
            System.out.println(" salah ! ");
        pendapatan = komisi + jasa ;
        System.out.println(" nama sales " + nama);
        System.out.println("Selamat, total penjualan anda hari ini adalah   " + String.format("%.2f", penjualan));
        System.out.println(" Anda berhak mendapatkan komisi " + String.format("%.2f", komisi) + " dan uang jasa " + String.format("%.2f", jasa));
        System.out.println(" Total pendapatan anda hari ini adalah  " + String.format("%.2f", pendapatan));
    }
}
