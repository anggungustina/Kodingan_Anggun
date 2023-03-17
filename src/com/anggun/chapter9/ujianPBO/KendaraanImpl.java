package com.anggun.chapter9.ujianPBO;

public class KendaraanImpl {
    public static void main(String[] args) {
        //Kendraaan = new Kendraaan();// Error cause class abstract

//        Mobil mobil1 = new Mobil(); //tanpa method
//        mobil1.name = " Avanza";
//
//        System.out.println(mobil1.name);

        Kendaraaan kendaraaan = new Mobil();
        kendaraaan.name ="avanza";
        kendaraaan.kendaraan();


    }
}
