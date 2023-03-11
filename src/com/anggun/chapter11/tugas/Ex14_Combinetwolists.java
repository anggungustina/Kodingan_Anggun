package com.anggun.chapter11.tugas;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class Ex14_Combinetwolists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        System.out.print("Enter five integer for list1: ");
        fill(list);
        System.out.print("Enter five integer for list2: ");
        fill(list2);

        ArrayList<Integer> list3 = union(list1, list2);
        System.out.print("The combined list is: ");
        for(int i = 0; i < list3.size(); i++){
            System.out.println(list3.get(i) + " ");
        }
        System.out.println();
    }
    public static  ArrayList<Integer> union(
            ArrayList<Integer> list
    )
}
