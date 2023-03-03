package com.anggun.chapter10.tugas;

public class MyPoints {
    private double x;
    private double y;

    MyPoints() {
        this (0, 0);
    }
    MyPoints(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return  x;
    }
    public  double getY() {
        return y;
    }
    public  double distance(MyPoints myPoints) {
        return  Math.sqrt(Math.pow(myPoints.getX() - x, 2) + Math.pow(myPoints.getY() - y, 2));
    }
    public double distance(double x, double y) {
        return distance(new MyPoints(x, y));
    }

}
