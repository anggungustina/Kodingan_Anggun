package com.anggun.chapter10.tugas;

public class Ex23_ImplementtheStringclass {
    public static void main(String[] args) {

        MyString2 str1 = new MyString2("test1");
        MyString2 str2 = new MyString2("abcdefghijkls");

        System.out.println("\nCompare str1 to \"test1\":");
        System.out.println(str1.compare("test1"));

        System.out.println("\nDisplay a substring if str2 begining at index 5: ");
        print(str2.substring(5));

        System.out.println("\nConvert str2 to upper case: ");
        print(str2.toUpperCase());

        System.out.println("\nDisplay the boolean value true as a MyString2 object: ");
        print(str1.toChars());
    }
    public static void print(MyString2 str) {
        print(str.toChars());
    }
    public static void print(char[]chars) {
        for (int i = 0; i < chars.length; i++){
            System.out.print(chars[i]);
        }
        System.out.println();
    }
}
