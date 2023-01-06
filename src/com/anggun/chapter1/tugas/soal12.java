package com.anggun.chapter1.tugas;

public class soal12 {
    public static void main(String[] strings) {
        // Making variables to hold current time and distance
        double hours = 1 ;
        double minutes = 40 ;
        double seconds = 35 ;
        double distanceInMiles = 24 ;
        // Converting from miles to kilometers
        // Note: the book said 1.6, however 1.60934 is more accurate
        double distanceInKilometers = distanceInMiles * 1.60934;
        //converting current time (hour, minutes, seconds) into total amount of minutes
        double timeInMinutes = hours * 60.0 + minutes + seconds / 60.0;
        //calculating kilometers per hour
        //kph = 60 * distance traveled / minutes taken
        double kilometersPerHour = 60.0 * distanceInKilometers / timeInMinutes;
        System.out.println(kilometersPerHour);
    }
}
