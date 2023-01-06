package com.anggun.chapter1.ujian;

public class soal4 {
    public static void main(String[] args){

        double hours = 2 ;
        double minutes = 30 ;
        double seconds = 45 ;
        double distanceInMiles = 50 ;

        double distanceInKilometers = distanceInMiles * 1.6 ;
        double timeInMinutes = hours * 60.0 + minutes + seconds / 60.0 ;
        double kilometersPerHour = 60.0 * distanceInKilometers / timeInMinutes ;

        System.out.println("Miles / (Hour + (minutes / 60 ) + (second / 3600)) * 1.6") ;
        System.out.println("50    / (2    + (30     / 60  ) + (45    /  3600)) * 1.6") ;
        System.out.println(" kecepatan rata rata dalam kilometer per jam adalah " + String.format("%.2f",kilometersPerHour) + "km /jam") ;
    }
}
