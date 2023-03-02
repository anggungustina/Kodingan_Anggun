package com.anggun.chapter9.latihan;

public class Lis6_Circle {
    double radius;
    static  int numberOfObjects = 0;

    Lis6_Circle() {
        radius = 1;
        numberOfObjects++;
    }
    Lis6_Circle(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    static  int getNumberOfObjects(){
        return numberOfObjects;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }
}
