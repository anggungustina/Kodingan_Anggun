package com.anggun.chapter5.tugas;

import java.util.Scanner;

public class exercises44_ComputerArchitectureBitLevelOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        short number = input.nextShort();

        String bits = "";
        for (int i = 0; i < 16; i++) {
            bits = (number & 1) + bits;
            number >>= 1;
        }
        System.out.println("The bits are " + bits);
    }
}
/*(Computer architecture: bit-level operations) A short value is stored in 16 bits.
Write a program that prompts the user to enter a short integer and displays the 16
bits for the integer. Here are sample runs:
Enter an integer: 5
The bits are 0000000000000101
Enter an integer: –5
The bits are 1111111111111011
(Hint: You need to use the bitwise right shift operator (>>) and the bitwise AND
operator (&), which are covered in Appendix G, Bitwise Operations.)

 */