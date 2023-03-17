package com.anggun.chapter12.tugas;

public class Ex9_BinaryFormatException {
    public static int bin2Dec(String binarystring) throws  BinaryFormatException {
        int decimal = 0;
        for (int i = 0, j = binarystring.length() - 1;
             i < binarystring.length(); i++, j--) {
            if (binarystring.charAt(i) < '0' || binarystring.charAt(i) > '1')
                throw new BinaryFormatException(binarystring);
            decimal += (Integer.parseInt(String.valueOf(binarystring.charAt(i)))) * Math.pow(2, j);
        }
        return decimal;
    }
}
