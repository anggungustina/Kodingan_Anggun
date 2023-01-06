package com.anggun.chapter5.latihan;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int number = (int)(Math.random() * 101);
        System.out.println("Guess a magic number batween o and 100");
        int guess = -1;
        while(guess != number){
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();
            if (guess == number)
                System.out.println("Yes, the number is " + number);
            else if (guess > number)
                System.out.println("Your guess is to high");
            else
                System.out.println("Your guess it to low");
        }
    }
}
