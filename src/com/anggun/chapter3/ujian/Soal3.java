package com.anggun.chapter3.ujian;
import java.util.Scanner;
public class Soal3 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nama bulan dalam bahasa indonesia:  ");
        String bulan = input.nextLine();
        System.out.println("Masukan Tahun: ");
        int tahun = input.nextInt();

        System.out.println("Pada bulan  " + bulan + "  Tahun " + tahun + " ada");
        switch(bulan){
            case "Januari" :
            case "Maret" :
            case "Mei" :
            case "Juli" :
            case "Agustus" :
            case "Oktober" :
            case "Desember" :
                System.out.println("31 hari"); break;
            case  "April" :
            case  "Juni" :
            case  "September" :
            case  "November" :
                System.out.println("30 hari"); break;
            case "Februari" :

                if(tahun % 400 == 0) {
                    System.out.print("29 hari, ");
                }
                else if ((tahun % 400 != 0) && (tahun % 100 == 0)){
                    System.out.print("28 hari, "); break;
                }
                else if ((tahun % 400 != 0) && (tahun % 100 != 0) && (tahun % 4 ==0)){
                    System.out.println(" 29 hari,");
                }
                else {
                    System.out.println(" 28 hari,");
                }
        }
        if (tahun % 400 == 0) {
            System.out.println("Tahun ini merupakan tahun kabisat");
        }
        else if (tahun % 100 == 0) {
            System.out.println("Tahun ini bukan merupakan tahun kabisat");
        }
        else if (tahun % 4 == 0) {
            System.out.println(" Tahun ini  merupakan tahun kabisat");
        }
        else {
            System.out.print("Tahun ini bukan merupakan tahun kabisat");
        }

    }
}
