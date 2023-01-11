package com.anggun.chapter5.tugas;

public class exercises25_ComputePI {
    public static void main(String[] args) {
        double sum = 0;
        double value = 10000.0;
        for (double d = 1; d <= (2 * value - 1); d += 2) {
            sum += 1 / d;
            d += 2;
            sum -= 1 / d;
        }
        double pi = 4 * sum;
        System.out.println("PI value for i = 10000: " + pi);
        sum = 0;
        value = 20000.0;
        for (double d = 1; d <= (2 * value - 1); d += 2) {
            sum += 1 / d;
            d += 2;
            sum -= 1 / d;
        }
        pi = 4 * sum;
        System.out.println("PI value for i = 20000: " + pi);
        sum = 0;
        value = 100000.0;
        for (double d = 1; d <= (2 * value - 1); d += 2) {
            sum += 1 / d;
            d += 2;
            sum -= 1 / d;
        }
        pi = 4 * sum;

        System.out.println("PI value for i = 100000: " + pi);
    }
}
/*(Compute p) You can approximate p by using the following summation:
pi = 4 (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + .. + (-)i+1 / 2i - 1 )

 */