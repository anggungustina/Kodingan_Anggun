package com.anggun.chapter6.ujian;

public class Soal1 {
    public static void main(String[] args) {
        System.out.println(
                "\nInch       Meter       |   Meter       Inch\n" +
                        "-----------------------------------------------------------");
        for (double inch = 1.0, meter = 1.0; inch <= 100.0; inch++, meter += 5) {
            System.out.printf("%5.1f   ", meter);
            System.out.printf("%5.4f", meterToInch(meter));
            System.out.print("       |         ");
            System.out.printf("%-5.1f", inch);
            System.out.printf("%5.4f\n", inchToMeter(inch));
        }
    }

    public static double inchToMeter(double inch) {
        return 39.3701 * inch;
    }

    public static double meterToInch(double meter) {
        return 0.0254 * meter;
    }
}
