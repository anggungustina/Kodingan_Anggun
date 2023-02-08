package com.anggun.chapter7.tugas;

import java.util.Scanner;

public class Ex9_Findthesmallestelement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }
        System.out.println("The minimum number is: " + min(number));
    }

    public static double min(double[] array) {
        double min = array[0];
        for (double i : array) {
            if (i < min)
                min = i;
        }
        return min;
    }

}
