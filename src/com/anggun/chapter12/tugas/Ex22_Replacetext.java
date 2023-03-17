package com.anggun.chapter12.tugas;
import java.util.*;
import java.io.*;
public class Ex22_Replacetext {
    public static void main(String[] args) throws Exception{

        if(args.length != 3) {
            System.out.println("Usage : java x22_Replacetext dir oldString newString ");
            System.exit(1);
        }
        File dir = new File(args[0]);
        if (!dir.isDirectory()) {
            System.out.println("Directory " + args[0] + " does not exist");
            System.exit(2);
        }
        File[] files = dir.listFiles();

        for (File e: files) {
            replaceText(e, args);
        }
    }
    public static void replaceText(File file, String[] args)
        throws FileNotFoundException{

        ArrayList<String> list = new ArrayList<>();

        try(
                Scanner input = new Scanner(file);

                ){
            while (input.hasNext()) {
                String s1 = input.nextLine();
                list.add(s1.replaceAll(args[1], args[2]));
            }
        }
        try(
                PrintWriter output = new PrintWriter(file);
                ){
            for (int i = 0; i < list.size(); i++) {
                output.println(list.get(i));
            }
        }
    }
}

