package com.anggun.chapter9.tugas;
import java.util.GregorianCalendar;
public class Ex5_UsetheGregorianCalendarclass {
    public static void main(String[] args) {
        GregorianCalendar calender = new GregorianCalendar();

        System.out.print("\nCurrent year, month, and day in format Mth/Day/Year: ");
        System.out.println(calender.get(calender.MONTH) + "/" + calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));

        System.out.print("\nElapsed time since January 1, 1970 set to " + "1234567898765 in format Mth/Day/Year: ");
        System.out.println(calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));
    }

}
