package com.anggun.chapter7.tugas;

import java.util.Scanner;

public class Ex10_Findtheindexofthesmallestelemen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("The minimum number is " + numbers[indexOfSmallestElement(numbers)] + " index " + indexOfSmallestElement(numbers));
    }

    public static int indexOfSmallestElement(double[] array) {
        if (array.length <= 1)
            return 0;

        double min = array[0];
        int minimumIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minimumIndex = i;
            }
        }
        return minimumIndex;
    }
}
