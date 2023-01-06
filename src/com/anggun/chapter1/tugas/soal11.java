package com.anggun.chapter1.tugas;

public class soal11 {
    public static void main(String[] strings) {
        double birthRateInSeconds = 7.0;
        double deathRateInseconds = 13.0;
        double newImmigrantInSeconds = 45.0;


        double currentPopulation = 312032486;

        double secondsInYears = 60 * 60 * 24 * 365;

        double numBirths = secondsInYears / birthRateInSeconds;
        double numDeaths = secondsInYears / deathRateInseconds;
        double numImmigrants = secondsInYears / newImmigrantInSeconds;

        for (int i = 1 ; i <= 5; i++) {
            currentPopulation += numBirths + numImmigrants - numDeaths;
            System.out.println("year " + i + " = " + (int)currentPopulation);
        }


    }
}
