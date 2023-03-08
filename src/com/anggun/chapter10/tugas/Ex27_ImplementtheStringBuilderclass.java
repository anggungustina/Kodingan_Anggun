package com.anggun.chapter10.tugas;

public class Ex27_ImplementtheStringBuilderclass {
    public static void main(String[] args) {

        MystringBuilder str1 =  new MystringBuilder("TEST");

        System.out.println("\nAppend the string \" MyStringBuilder\" to string: " + str1.append(new MystringBuilder(" MyStringBuilder")));

        System.out.println("\nAppend integer 101 to the string: " + str1.append(101));

        System.out.println("\nLength of string: " + str1.length());

        System.out.println("\nCharacter at index 2: " + str1.charAt(2));


        System.out.println("\nString to lower case: " + str1.toLowercase());


        System.out.println("\nSubstring of string from index 1 to 3: " + str1.substring(1, 3));


        System.out.println("\nDisplay string: " + str1.toString());
    }
}
