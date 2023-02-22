//package com.anggun.chapter13.latihan;
//
//import java.awt.*;
//
//public class Lis9_ComparableRectangle  extends Rectangle
//    implements Comparable<Lis9_ComparableRectangle> {
//    public  Lis9_ComparableRectangle(double width, double height) {
//        super((int) width, (int) height);
//    }
//    @Override
//
//    public  int compareTo(Lis9_ComparableRectangle o) {
//        if (getArea() > o.getArea())
//            return 1;
//        else if (getArea() < o.getArea())
//            return  -1;
//        else
//            return  0;
//    }
//    @Override
//    public  String toString() {
//        return "Width: " + getWidth() + " Height: " + getHeight() + "Area: " + getArea();
//    }
//}
//
