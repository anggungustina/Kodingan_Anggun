package com.anggun.chapter11.tugas;
import java.util.Scanner;
import java.util.ArrayList;
public class Ex16_Additionquiz {
    public static  void main(String[] args){
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> answers = new ArrayList<Integer>();

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        while (number1 + number2 != answer){
            if(answers.contains(answer))
                System.out.println("You already entered " + answer);
            else {
                System.out.println("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
                answers.add(answer);
            }
            answer = input.nextInt();
        }
        System.out.println("You got it!");

    }

}

