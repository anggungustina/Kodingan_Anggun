package com.anggun.chapter2.ujian;

import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jarak perjalanan");
        double jarakperjalanan = input.nextDouble();
        System.out.print("Masukan konsumsi bahan bakar dalam kilometer per liter");
        double konsumsibahanbakar = input.nextDouble();
        System.out.print("Masukan harga bahan bakar perliter");
        double hargabahanbakar = input.nextDouble();

        double totalbiaya = (jarakperjalanan / konsumsibahanbakar * hargabahanbakar);
        System.out.println("Maka total biaya perjalanan anda adalah " + String.format("%.2f", totalbiaya));
    }
}
