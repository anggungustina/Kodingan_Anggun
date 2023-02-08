package com.anggun.chapter7.latihan;

public class Lis3_TestPassArray {
    public static void main(String[] args) {
        int[] a = {1, 2};

        System.out.println("Before invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swap(a[0], a[1]);
        System.out.println("after invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");

        System.out.println("Before invoking swapFirstTwoArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swapFirtsTwoArray(a);
        System.out.println("After invoking swapFirstTwoArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
    }

    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    public static void swapFirtsTwoArray(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
