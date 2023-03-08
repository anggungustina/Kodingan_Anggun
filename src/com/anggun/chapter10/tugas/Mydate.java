package com.anggun.chapter10.tugas;
import java.util.GregorianCalendar;
public class Mydate {
    private int year;
    private int month;
    private int day;

    Mydate() {
        GregorianCalendar calendar = new GregorianCalendar();
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

    }
    Mydate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;

    }
    public int getYear() {
        return year;
    }
    public  String getDay() {
        String d = String.valueOf(day);
        return (day < 10 ? "0" + d : d);
    }
    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
