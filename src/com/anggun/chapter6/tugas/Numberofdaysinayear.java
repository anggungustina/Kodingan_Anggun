package com.anggun.chapter6.tugas;

public class Numberofdaysinayear {
    public static void main(String[] args) {
        System.out.println("Year     Days inyear");
        for (int year = 2000; year <= 2020; year++) {
            System.out.println(year + "       " + numberOfdaysInAYear(year));
        }
    }

    public static int numberOfdaysInAYear(int year) {
        if (isLeapyear(year))
            return 366;
        else
            return 365;
    }

    public static boolean isLeapyear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
