package com.anggun.chapter5.tugas;

public class exercises12_Findthesmallestnsuchthatn212000 {
    public static void main(String[] args) {
        int n = 0;
        while (Math.pow(n, 2) <= 12000) {

            while (Math.pow(n, 2) < 12000) {

                n++;
            }
            System.out.println("The smallest integer n such that n^2 is greater than 12,000: " + n);
        }
    }
}
