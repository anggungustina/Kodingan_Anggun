package com.anggun.chapter9.tugas;
import java.util.Scanner;
public class Ex10_Algebraquadraticequations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadrationEquation quadrationEquation = new QuadrationEquation(a, b, c);
        System.out.print("The equation has ");
        if (quadrationEquation.getDiscriminant() < 0)
            System.out.println("no real roots");
        else if (quadrationEquation.getDiscriminant() > 0) {
            System.out.println("two roots " + quadrationEquation.getRoot1() + " and " + quadrationEquation.getRoot2());
        }
        else {
            System.out.println("one root " + (quadrationEquation.getRoot1() > 0 ? quadrationEquation.getRoot1() : quadrationEquation.getRoot2()));
        }
    }
}
