package com.anggun.chapter12.tugas;
import java.util.*;
import java.io.*;
public class Ex21_Datasorted {
    public static void main(String[] args) throws Exception{
        File file = new File("SortedString.txt");

        if (!file.exists()) {
            System.out.println(file.getName() + " does not exist");
            System.exit(0);
        }
        System.out.println("File " + file.getName());
        boolean dataSorted = true;
        String string1 = "";
        String string2 = "";
        try (
                Scanner input = new Scanner(file);
        ) {
            if (input.hasNext())
                string1 = input.next();

            while (input.hasNext() && dataSorted) {
                string2 = input.next();
                if (string1.compareTo(string2) > 0) {
                    System.out.println(
                            "The strings " + string1 + " and " + string2 +
                                    " are out of order");
                    dataSorted = false;
                }
                string1 = string2;
            }
        }
        if (dataSorted) {
            System.out.println(
                    "The strings in the file are stored in increasing order");
        }
    }
}
