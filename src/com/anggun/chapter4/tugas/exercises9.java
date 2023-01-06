package com.anggun.chapter4.tugas;
import java.util.Scanner;
public class exercises9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        System.out.println((int)ch);
    }
}
