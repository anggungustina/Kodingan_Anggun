package com.anggun.chapter12.tugas;
import java.util.Scanner;
public class TestBin2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary: ");
        try {
            System.out.println(Ex7_NumberFormatException.bin2Dec(input.nextLine()));
        }
        catch (NumberFormatException ex){
            System.out.println(ex.getMessage());
        }

    }
}
