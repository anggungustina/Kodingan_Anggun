package com.anggun.chapter3.ujian;
import java.util.Scanner;
public class Soal1 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Enter jenis kelamin:  ");
        String jeniskelamin = input.nextLine();

        System.out.println("Enter tinggi  badan(cm): ");
        double tinggibadan = input.nextDouble();
        System.out.println("Enter berat  badan(kg): ");
        double beratbadan = input.nextDouble();

        double meter = tinggibadan / 100;
        double BMI = beratbadan / Math.pow(tinggibadan / 100, 2);
        double brocaL = (tinggibadan - 100) - (0.10 * (tinggibadan - 100));
        double brocaP = (tinggibadan - 100) - (0.15 * (tinggibadan - 100));

        System.out.print("jenis kelamin anda adalah ");
        switch (jeniskelamin ) {
            case "P" :
                System.out.print("perempuan");
                System.out.print(" , maka berat badan ideal anda adalah " + brocaP +" kg"); break;
            case "L" :
                System.out.print("lakilaki");
                System.out.print(" , maka berat badan anda adalah " + brocaL +" kg"); break;

        }

        System.out.print("\n nilai BMI tubuh anda adalah " + String.format("%.2f",  BMI) + " , maka kategori tubuh anda  ");

        if (BMI < 18.5)
            System.out.print(" kurus");
        else if (BMI < 25)
            System.out.print(" normal");
        else if (BMI < 30)
            System.out.println(" kelebihan berat badan");
        else
            System.out.print(" obesitas");


    }
}
