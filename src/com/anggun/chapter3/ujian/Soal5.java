package com.anggun.chapter3.ujian;
import java.util.Scanner;
public class Soal5 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Aplikasi penilaian(rentang nilai 0 - 100");
        System.out.print("Masukan nilai Kehadiran: ");
        double nK = input.nextDouble();
        System.out.print("Masukan nilai Tugas: ");
        double nT = input.nextDouble();
        System.out.print("Masukan nilai UTS: ");
        double nUT = input.nextDouble();
        System.out.print("Masukan nilai UAS: ");
        double nUA = input.nextDouble();
        System.out.print("Masukan nilai Project akhir: ");
        double nP = input.nextDouble();

        double nilaiakhir = input.nextDouble();
        nilaiakhir = ((nK* 0.5) + (nT * 0.20) + (nP  * 0.30) + (nUT * 0.20) + (nUA* 0.25));

        if (nilaiakhir >=90) {
            System.out.println("Selamat anda lulus dengan nilai A") ;
        } else if (nilaiakhir >= 85) {
            System.out.println("Selamat anda lulus dengan nilai B+") ;
        } else if (nilaiakhir >= 80) {
            System.out.println("Selamat anda lulus dengan nilai B") ;
        } else if (nilaiakhir >= 75) {
            System.out.println("Selamat anda lulus dengan nilai B-") ;
        } else if (nilaiakhir >= 70) {
            System.out.println("Selamat anda lulus dengan nilai C") ;
        } else if (nilaiakhir >= 65) {
            System.out.println("Selamat anda lulus dengan nilai C+") ;
        } else if (nilaiakhir >= 60) {
            System.out.println("Selamat anda lulus dengan nilai  C-") ;
        } else if (nilaiakhir > 50) {
            System.out.println("Nilai anda D dintatakan Tidak lulus Anda harus mengulang matakuliah ini");
        } else if (nilaiakhir < 50) {
            System.out.println("Nilai anda E dintatakan Tidak lulus Anda harus mengulang matakuliah ini");
        }
    }
}
