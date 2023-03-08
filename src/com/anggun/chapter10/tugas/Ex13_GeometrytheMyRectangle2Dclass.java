package com.anggun.chapter10.tugas;

public class Ex13_GeometrytheMyRectangle2Dclass {
    public static void main(String[] args) {

        Myrectangle2D r1 = new Myrectangle2D(2, 2, 5.5, 4.9);

        System.out.println("\nrectangle: ");
        System.out.println("Area: " + r1.gerArea());
        System.out.println("perimeter: " + r1.getPerimeter());
        System.out.println(( r1.contains(3,3) ? "Contains" : "Does not contain") + " the point (3, 3).");
        System.out.println((r1.overlaps(new Myrectangle2D(3, 5, 2.3, 5.4)) ? "Overlaps" : "Does not overlap") + " the rectangle with points (3, 5, 2.3, 5.4)");

    }
}
