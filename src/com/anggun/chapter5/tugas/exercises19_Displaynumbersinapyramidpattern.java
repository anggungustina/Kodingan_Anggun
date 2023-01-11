package com.anggun.chapter5.tugas;

public class exercises19_Displaynumbersinapyramidpattern {
    public static void main(String[] args) {
        int startRight = 0,
                endSpace = 7;
        for (int row = 1; row <= 128; row += row) {
            for (int startSpace = 0; startSpace < endSpace; startSpace++) {
                System.out.print("   ");
            }
            for (int I = 1; 1 <= row; I += 1) {
                System.out.printf("%4d", (1));
            }
            for (int r = startRight; r > 0; r /= 2) {
                System.out.printf("%4d", (r));
            }
            System.out.println();
            endSpace--;
            startRight = row;
        }
    }
}
