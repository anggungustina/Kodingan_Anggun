package com.anggun.chapter2.tugas;

import java.util.Scanner;

public class soal16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the side: ");
        double side = input.nextDouble();
        double area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2);
        System.out.println("The area of hexagon is " + area);
    }
}
