package com.anggun.chapter5.tugas;

import java.util.Scanner;

public class exercises29_Displaycalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter firts day of the year: ");
        int day = input.nextInt();

        String header;
        System.out.println();
        for (int month = 1; month <= 12; month++) {
            header = " ";

            switch (month) {
                case 1:
                    header += "Januari ";
                    break;
                case 2:
                    header += "Februari ";
                    break;
                case 3:
                    header += "Maret ";
                    break;
                case 4:
                    header += "April ";
                    break;
                case 5:
                    header += "Mei ";
                    break;
                case 6:
                    header += "Juni ";
                    break;
                case 7:
                    header += "Juli ";
                    break;
                case 8:
                    header += "Agustus ";
                    break;
                case 9:
                    header += "September ";
                    break;
                case 10:
                    header += "Oktober ";
                    break;
                case 11:
                    header += "Novemeber ";
                    break;
                case 12:
                    header += "Desember ";
                    break;
            }
            header += year + " ";

            for (int b = 0; b < 23 - (header.length() / 2); b++) {
                System.out.print(" ");
            }
            System.out.println(header + "\n---------------------------------------------------------------\n" + "Minggu  Senin  Selasa  Rabu  Kamis  Jumat  Sabtu  Minggu");
            day %= 7;
            for (int b = 0; b <= day * 7; b++) {
                System.out.print(" ");
            }
            int lastDay = 0;
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                lastDay += 31;
            else if (month == 4 || month == 6 || month == 9 || month == 11)
                lastDay += 30;
            else {
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                    lastDay += 29;
                else lastDay += 28;
            }
            for (int d = 1; d <= lastDay; d++) {
                if (d < 10)
                    System.out.print(" ");
                if (day % 7 == 6)
                    System.out.print(d + "\n ");
                else {
                    System.out.print(d + "   ");
                    if (d == lastDay)
                        System.out.println();
                }
                day++;
            }
            System.out.println();
        }
    }
}
/*(Display calendars) Write a program that prompts the user to enter the year and
first day of the year and displays the calendar table for the year on the console. For
example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013,
your program should display the calendar for each month in the year, as follows:
January 2013
Sun Mon Tue Wed Thu Fri Sat
1 2 3 4 5 6 7 8 9 10 11 12
13 14 15 16 17 18 19
20 21 22 23 24 25 26
27 28 29 30 31
. . .
December 2013
Sun Mon Tue Wed Thu Fri Sat
1 2 3 4 5 6 7 8 9 10 11 12 13 14
15 16 17 18 19 20 21
22 23 24 25 26 27 28
29 30 31

 */