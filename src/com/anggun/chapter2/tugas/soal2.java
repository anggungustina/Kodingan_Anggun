package com.anggun.chapter2.tugas;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double PI = 3.14159;
        double area = radius * radius * PI;
        double volume = area * length;
        System.out.println("The area is" + String.format("%.2f", area));
        System.out.println("The volume is" + String.format("%.2f", volume));
    }
}
