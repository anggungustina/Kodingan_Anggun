package com.anggun.chapter10.tugas;

public class Ex4_TheMyPointclass {
    public static void main(String[] args) {
        MyPoints points1 = new MyPoints();
        MyPoints points2 = new MyPoints(10, 30.5);

        System.out.println("The distance between(" + points1.getX() + ", " + points2.getY() + ") is: " + points1.distance(points2));
    }
}
