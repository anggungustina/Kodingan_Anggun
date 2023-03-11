package com.anggun.chapter11.tugas;
import java.util.Scanner;
import java.util.ArrayList;
public class Ex4_MaximumelementinArrayList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter a sequence of numbers ending wih 0: ");
        Integer number = input.nextInt();
        while (number.intValue() != 0) {
            list.add(number);
            number = input.nextInt();
        }
        System.out.println("the largets number in the input is " + max(list));
    }
    public static Integer max(ArrayList<Integer> list){
        if(list.size() == 0)
            return null;

        Integer max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max)
                max = list.get(i);
        }
        return max;
    }
}
