package com.anggun.chapter7.tugas;

import java.util.Scanner;

public class Ex4_Analyzescores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter scores: (negative number signifies end): ");

        int[] scores = new int[100];
        int num;
        int numberOfScores;
        int average;
        numberOfScores = average = 0;
        for (int i = 0; i < 100; i++) {
            num = input.nextInt();
            if (num < 0)
                break;

            scores[i] = num;
            average += num;
            numberOfScores++;
        }
        average /= numberOfScores;
        int aboveOrEqual;
        int below;
        aboveOrEqual = below = 0;
        for (int i = 0; i < numberOfScores; i++) {
            if (scores[i] > average)
                aboveOrEqual++;
            else
                below++;
        }
        System.out.println("\nAverage of score: " + average);
        System.out.println("Number of above or equal to average: " + aboveOrEqual);
        System.out.println("Number of scores below average: " + below);
    }
}
