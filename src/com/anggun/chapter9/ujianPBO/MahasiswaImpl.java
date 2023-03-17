package com.anggun.chapter9.ujianPBO;

public class MahasiswaImpl {
    public static void main(String[] args) {

        //object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.name = "Anggun G";
        mahasiswa1.address = "Cikijing";
        mahasiswa1.age = Integer.parseInt("19");

//        Mahasiswa mahasiswa2 = new Mahasiswa();
//        Mahasiswa mahasiswa3 = new Mahasiswa();



        System.out.println(mahasiswa1.name);
        System.out.println(mahasiswa1.address);
        System.out.println(mahasiswa1.age);



    }
}
