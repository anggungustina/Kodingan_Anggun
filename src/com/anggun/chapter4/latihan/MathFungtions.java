package com.anggun.chapter4.latihan;

public class MathFungtions {
    public static void main(String[] args) {
        int y, x;
        x = 10;
        y = hitung(x);

        System.out.println("x = " + x + "y = " + y);
    }

    static int hitung (int input){
        int hasil;
        hasil = (input + 2) * input;
        return hasil;
    }
}
