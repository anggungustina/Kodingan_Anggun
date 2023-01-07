package com.anggun.chapter5.tugas;
import java.util.Scanner;
public class exercises3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double POUNDS_PER_KILOGRAM = 2.2;
        System.out.println("Kilograms Pounds");
        for (int i = 1; i <= 199; i += 2){
            System.out.printf("%-15d%6.1f\n" , i, (i * POUNDS_PER_KILOGRAM));
        }
    }
}
