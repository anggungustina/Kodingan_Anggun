package com.anggun.chapter10.tugas;

public class Ex22_ImplementtheStringclass {
    public static void main(String[] args) {
        char[] test = {'T', 'e', 'S', 't'};
        char[] test2 = {'T', 'e', 'S', 't', '2'};

        MyString str = new MyString(test);
        MyString str2 = new MyString(test2);

        System.out.println("\nCharacter at index 1 of MyString object 1: " + str.charAt(1));
        System.out.println("\nLength of MyString object 1: " + str.length());

        System.out.println("\nSubstring from index 2 to 4 MyString object 1: ");
        MyString substr = str.subsring(2, 4);
        for (int i = 0; i < substr.length(); i++){
            System.out.print(substr.charAt(i));
        }
        System.out.println();

        System.out.println("\nMyString object 1 to lowercase: ");
        MyString lower = str.toLowercase();
        for (int i = 0; i < lower.length(); i++) {
            System.out.print(lower.charAt(i));
        }
        System.out.println();

        System.out.println("\nMyString object 1 is equal to Mystring object: ");
        MyString value = str.valueOf(145);
        for(int i = 0; i < value.length(); i++){
            System.out.print(value.charAt(i));
        }
        System.out.println();
    }
}
