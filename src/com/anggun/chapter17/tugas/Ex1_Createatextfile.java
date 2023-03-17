//package com.anggun.chapter17.tugas;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Ex1_Createatextfile {
//    public static void main(String[] args) throws FileNotFoundException {
//        ArrayList<String> list = new ArrayList<>();
//
//        File file = new File("Ex1_Createatextfile");
//        if (file.exists()) {
//            try (
//                    Scanner input = new Scanner(file);
//
//                    ) {
//                while (input.hasNext()) {
//                    list.add(input.nextLine());
//                }
//            }
//
//        }
//        for (int i = 0; i < 100; i++) {
//            list.add(((int)(Math.random() * 100)) + " ");
//        }
//        try (
//                PrintWriter output = new PrintWriter(file);
//                ) {
//            for (String 1: list) {
//                output.print(1);
//            }
//        }
//    }
//}
