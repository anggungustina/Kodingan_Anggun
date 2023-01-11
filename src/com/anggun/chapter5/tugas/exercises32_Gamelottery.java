package com.anggun.chapter5.tugas;

import java.util.Scanner;

public class exercises32_Gamelottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lotteryDigit1, lotteryDigit2;
        lotteryDigit1 = (int) (Math.random() * 10);

        do {
            lotteryDigit2 = (int) (Math.random() * 10);
        } while (lotteryDigit1 == lotteryDigit2);
        System.out.print("Enter your lottery pick (two distinct digits): ");
        int guess = input.nextInt();

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println(
                "The lottery number is " + lotteryDigit1 + lotteryDigit2);

        if (guessDigit1 == lotteryDigit1 &&
                guessDigit2 == lotteryDigit2)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == lotteryDigit1
                && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }
}
/*(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a twodigit number. The two digits in the number are distinct. (Hint: Generate the first
digit. Use a loop to continuously generate the second digit until it is different
from the first digit.)

 */