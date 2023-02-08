package com.anggun.chapter7.latihan;

public class Lis6_LinearSearch {
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }
}
