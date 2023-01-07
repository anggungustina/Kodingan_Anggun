package com.anggun.chapter5.tugas;
import java.util.Scanner;
public class exercises8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int highestScore = 0;
        String highestScoreName = " ";
        System.out.print("enter the number of students:  ");
        int numberOfStudents = input.nextInt();
        System.out.println("Enter each student's name and score");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student: " + (i + 1) + "\nName: ");
            String name = input.next();
            System.out.print(" Score: ");
            int score = input.nextInt();
            if (score > highestScore) {
                highestScore = score;
                highestScoreName = name;
            }
        }
        System.out.println("Student with the highest score: " + highestScoreName);
    }
}