package com.anggun.chapter9.tugas;

import java.util.Scanner;

public class Ex13_TheLocationclass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns iin the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();


        double[][] array = new double[rows][columns];
        System.out.println("Enter the array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        Location max = locateLargest(array);

        System.out.println("The location of the largest element is " + max.maxValue + " at (" + max.row  + ", " + max.colomn+ ")");

    }
    public static Location locateLargest(double[][] a) {
        return new Location(a);
    }
}
