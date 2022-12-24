package com.anggun.chapter3.tugas;

import java.util.Scanner;

public class soal1{
    public static void main(String[] args){
        int nilaiujian = 70;
        char indeksprestasi;

        if(nilaiujian >= 90) {
            indeksprestasi = 'A';
        } else if (nilaiujian >= 80) {
            indeksprestasi = 'B' ;
        } else if (nilaiujian >= 70) {
            indeksprestasi = 'C' ;
        } else if (nilaiujian >= 60) {
            indeksprestasi = 'D' ;
        } else if (nilaiujian >= 50) {
            indeksprestasi = 'E' ;
        } else {
            indeksprestasi = 'F' ;
        }
        System.out.println("Nilai ujian akhir anda adalah " + indeksprestasi);
    }
}