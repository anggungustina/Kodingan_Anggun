package com.anggun.chapter9.latihan;

public class Lis7_TestCircleWithStaticMembers {
    public static void main(String[] args) {

        System.out.println("Before creating object");
        System.out.println("The number of circle Objects is " + Lis6_Circle.numberOfObjects);

        Lis6_Circle c1 = new Lis6_Circle();

        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");

        Lis6_Circle c2 = new Lis6_Circle(5);

        c1.radius = 9;


        System.out.println("\nAfter creating c2 and modifying c1 ");

    }
}
