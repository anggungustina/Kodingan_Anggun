package com.anggun.chapter5.latihan;
import java.util.Scanner;
public class repeat {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        Scanner input = new Scanner(System.in);
        System.out.print("whet is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        while (number1 + number2 != answer) {
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
        }
        System.out.println("You got it!");
    }
}