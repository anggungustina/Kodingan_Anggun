package com.anggun.chapter9.tugas;

public class Location {
    int row;
    int colomn;
    double maxValue;

    Location(double[][] a) {
        maxValue = a[0][0];
        row = 0;
        colomn = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    row = i;
                    colomn = j;
                }
            }
        }
    }
}
