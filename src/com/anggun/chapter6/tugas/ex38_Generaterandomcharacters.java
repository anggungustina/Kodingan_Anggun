package com.anggun.chapter6.tugas;

import com.anggun.chapter6.latihan.RandomCharacter;

public class ex38_Generaterandomcharacters {
    public static void main(String[] args) {
        final int NUMNBER_OF_UPPERCASE_LETTERS = 100;
        final int NUMNBER_OF_SINGLE_DIGITS = 100;
        for (int i = 1; i <= NUMNBER_OF_UPPERCASE_LETTERS; i++) {
            System.out.print(RandomCharacter.getRandomUpperCaseLetter());
            System.out.print(i % NUMNBER_OF_UPPERCASE_LETTERS == 0 ? "\n" : " ");
        }

        for (int i = 1; i <= NUMNBER_OF_SINGLE_DIGITS; i++) {
            System.out.print(RandomCharacter.getRandomDigitCharacter());
            System.out.print(i % NUMNBER_OF_SINGLE_DIGITS == 0 ? "\n" : " ");
        }
    }

}
