//package com.anggun.chapter13.tugas;
//
//import java.util.Calendar;
//import java.util.GregorianCalendar;
//
//public class Ex4_Displaycalendars {
//    public static void main(String[] args) {
//        if (args.length != 2) {
//            System.out.println("Usage: java ");
//            System.exit(1);
//
//        }
//        Calendar calendar = new GregorianCalendar(Integer.valueOf(args[1]), Integer.valueOf(args[0]) - 1, 1);
//
//        printHeader(calendar);
//
//        for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++)
//            System.out.print("     ");
//
//        while (calendar.get(Calendar.DATE) <
//                calendar.getActualMaximum(Calendar.DATE)) {
//
//            if (calendar.get(Calendar.DAY_OF_WEEK) == 7)
//                System.out.print("%4d\n", calendar.get(Calendar.DATE));
//            else
//                System.out.print();
//        }
//
//    }
//}
