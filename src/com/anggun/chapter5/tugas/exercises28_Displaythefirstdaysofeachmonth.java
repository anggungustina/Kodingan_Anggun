package com.anggun.chapter5.tugas;

import java.util.Scanner;

public class exercises28_Displaythefirstdaysofeachmonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter firts day of the year: ");
        int day = input.nextInt();

        String output;
        for (int month = 1; month <= 12; month++) {
            output = " ";
            switch (month) {
                case 1:
                    output += "Januari ";
                    break;
                case 2:
                    output += "Februari ";
                    break;
                case 3:
                    output += "Maret ";
                    break;
                case 4:
                    output += "April ";
                    break;
                case 5:
                    output += "Mei ";
                    break;
                case 6:
                    output += "Juni ";
                    break;
                case 7:
                    output += "Juli ";
                    break;
                case 8:
                    output += "Agustus ";
                    break;
                case 9:
                    output += "September ";
                    break;
                case 10:
                    output += "Oktober ";
                    break;
                case 11:
                    output += "November ";
                    break;
                case 12:
                    output += "Desember ";
                    break;
            }
            output += "1, " + year + " is ";

            day %= 7;

            switch (day) {
                case 0:
                    System.out.println(output + "Minggu");
                    break;
                case 1:
                    System.out.println(output + "Senin");
                    break;
                case 2:
                    System.out.println(output + "Selasa");
                    break;
                case 3:
                    System.out.println(output + "Rabu");
                    break;
                case 4:
                    System.out.println(output + "Kamis");
                    break;
                case 5:
                    System.out.println(output + "Jumat");
                    break;
                case 6:
                    System.out.println(output + "Sabtu");
                    break;
            }
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                day += 31;
            else if (month == 4 || month == 6 || month == 9 || month == 11)
                day += 30;
            else {
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                    day += 29;
                else
                    day += 28;
            }
        }
    }
}
/*(Display the first days of each month) Write a program that prompts the user to
enter the year and first day of the year, then displays the first day of each month
in the year. For example, if the user entered the year 2013, and 2 for Tuesday,
January 1, 2013, your program should display the following output:
January 1, 2013 is Tuesday
...
December 1, 2013 is Sunday

 */