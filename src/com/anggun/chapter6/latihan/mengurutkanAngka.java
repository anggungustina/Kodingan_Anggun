package com.anggun.chapter6.latihan;

import java.util.Arrays;

public class mengurutkanAngka {
    public static void main(String[] args) {
        int[] arr = {
                10, 8, 9, 6, 4, 3, 2, 11, 15, 17, 1, 5, 7, 12, 13, 14, 16
        };
        System.out.println("Angka Array sebelum diurutkan: ");
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();

        Arrays.sort(arr);

        System.out.println("Angka Array setelah diurutkan: ");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
