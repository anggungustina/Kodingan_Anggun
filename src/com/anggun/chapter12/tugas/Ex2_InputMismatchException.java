package com.anggun.chapter12.tugas;
import java.util.*;
public class Ex2_InputMismatchException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        System.out.println("Enter two numbers: ");
        do {
            try {
                int number1 = input.nextInt();
                int number2 = input.nextInt();

                System.out.println("The sum is " + (number1 + number2));

                continueInput = false;
            }
            catch (InputMismatchException ex){
                System.out.println("Try again. (" + "Incorrect input: two integers are required) ");
                input.nextLine();
            }
        }while (continueInput);
    }
}
