package com.anggun.chapter13.latihan;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Lis6_Testcalender {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        System.out.println("current time is " + new Date());
        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
        System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
        System.out.println("DATE: " + calendar.get(Calendar.DATE));
        System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
        System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));

    }
}