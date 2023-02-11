package com.anggun.chapter7.tugas;

import java.util.Scanner;

public class Ex21_Sumintegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of balls to drop: ");
        int drops = input.nextInt();

        System.out.print("Enter the number of slots in the bean machine: ");
        int nails = input.nextInt() - 1;

        String[] paths = new String[nails * drops];
        int[] balls = new int[nails];

        int numberOfRs = 0;
        for (int i = 0; i < paths.length; i++) {
            paths[i] = getRandomPaths();

            if (paths[i] == "R") {
                numberOfRs++;
            }
            if ((i + 1) % nails == 0) {
                balls[numberOfRs]++;
                numberOfRs = 0;
            }

        }

        print(paths, nails);

        print(balls);
    }

    public static String getRandomPaths() {
        if ((int) (Math.random() * 2) == 0)
            return "L";
        else
            return "R";
    }

    public static void print(String[] list, int n) {
        System.out.println();
        for (int i = 0; i < list.length; i++)
            System.out.println(((i + 1) % n == 0) ? list[i] + "\n" : list[i]);
    }

    public static void print(int[] list) {
        int max = max(list);

        while (max > 0) {
            System.out.println();
            for (int i = 0; i < list.length; i++) {
                if (list[i] >= max) {
                    System.out.print("o");
                } else
                    System.out.print(" ");
            }
            max--;
        }
        System.out.println();
    }

    public static int max(int[] list) {
        int max = list[0];

        for (int i = 1; i < list.length; i++) {
            if (list[i] > max)
                max = list[i];
        }
        return max;
    }
}