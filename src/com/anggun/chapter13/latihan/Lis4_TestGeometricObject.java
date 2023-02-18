package com.anggun.chapter13.latihan;

public class Lis4_TestGeometricObject {
    public static void main(String[] args) {
        //buat dua objek geometri
        Lis1_GeometricObject geoObject1 = new Lis2_Circle() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };
        Lis1_GeometricObject geoObject2 = new Lis3_Rectangle() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };

        System.out.println("The two object have the same area? " + equalArea(geoObject1, geoObject2));

        displayGeometricObject(geoObject1);

        displayGeometricObject(geoObject2);
    }

    public static boolean equalArea(Lis1_GeometricObject object1, Lis1_GeometricObject object2) {
        return object1.getArea() == object2.getPerimeter();
    }

    public static void displayGeometricObject(Lis1_GeometricObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
