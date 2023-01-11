package com.anggun.chapter5.tugas;

import java.util.Scanner;

public class exercises34_Gamescissorrockpaper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computerWins, userWins;
        computerWins = userWins = 0;
        do {
            int computer = (int) (Math.random() * 3);
            System.out.print("scissor (0), rock(1), paper (2): ");
            int user = input.nextInt();

            System.out.print("The computer is ");
            switch (computer) {
                case 0:
                    System.out.print("scissor.");
                    break;
                case 1:
                    System.out.print("rock.");
                    break;
                case 2:
                    System.out.print("paper.");
                    break;
            }

            System.out.print(" You are ");
            switch (user) {
                case 0:
                    System.out.print("scissor");
                    break;
                case 1:
                    System.out.print("rock");
                    break;
                case 2:
                    System.out.print("paper");
                    break;
                default:
                    System.out.println(
                            "disqualified for entering an invalid number.");
                    System.exit(1);
            }
            if (computer == user)
                System.out.println(" too, It is a draw");
            else {
                boolean win = (user == 0 && computer == 2) ||
                        (user == 1 && computer == 0) ||
                        (user == 2 && computer == 1);
                if (win) {
                    System.out.println(". You won");
                    computerWins++;
                } else {
                    System.out.println(". You lose");
                    userWins++;
                }

            }
            System.out.println("Computer wins: " + computerWins +
                    "\nUser wins: " + userWins);
        } while (Math.abs(computerWins - userWins) <= 2);
    }
}


/*(Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that
plays the scissor–rock–paper game. Revise the program to let the user continuously play until either the user or the computer wins more than two times than its
opponent.

 */