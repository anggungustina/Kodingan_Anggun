package com.anggun.chapter4.tugas;
import java.util.Scanner;
public class exercises15 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        ch = Character.toUpperCase(ch);
        int number = 0;
        if (Character.isLetter(ch)) {
            if (ch >= 'W') number = 9;
            if (ch >= 'T') number = 8;
            if (ch >= 'P') number = 7;
            if (ch >= 'M') number = 6;
            if (ch >= 'J') number = 5;
            if (ch >= 'G') number = 4;
            if (ch >= 'D') number = 3;
            if (ch >= 'A') number = 2;
            System.out.println("The corresponding number is " + number);
        }
        else System.out.println(ch + " is an invalid");
    }
}
