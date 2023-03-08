package com.anggun.chapter10.tugas;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Ex21_Divisibleby5or6 {
    public static void main(String[] args) {

        int count = 0;
        BigInteger n = new BigInteger(String.valueOf(Long.MAX_VALUE));
        BigInteger five = new BigInteger("5");
        BigInteger six = new BigInteger("6");
        BigInteger zero = new BigInteger("0");

        System.out.println("\nFirst teh number greater than Long.MAX_VALUE" + " that are divisible by by 5 or 6:");
        while (count < 10) {
            n = n.add(new BigInteger("1"));
            if((n.remainder(five)).compareTo(zero) == 0 ||
                    (n.remainder(six)).compareTo(zero) == 0) {
                System.out.println(n);
                count++;
            }
        }

    }
}
