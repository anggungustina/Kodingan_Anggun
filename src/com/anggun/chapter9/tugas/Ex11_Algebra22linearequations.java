package com.anggun.chapter9.tugas;
import java.util.Scanner;
public class Ex11_Algebra22linearequations {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);

        if(linearEquation.isSolvable()) {
            System.out.println("x is " + linearEquation.getX() + " and y is " + linearEquation.getY());
        }
        else
            System.out.println("the equation has no solution.");


    }
}
