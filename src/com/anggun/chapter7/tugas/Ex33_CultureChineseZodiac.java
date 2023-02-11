package com.anggun.chapter7.tugas;

import java.util.Scanner;

public class Ex33_CultureChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] zoadiacs = {"monkeys", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.println(zoadiacs[year % 12]);

    }
}
