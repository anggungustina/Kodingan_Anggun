//package com.anggun.chapter4.tugas;
//import java.util.Scanner;
//public class exercises23 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter employee's name: ");
//        String name = input.nextLine();
//        System.out.print("Enter number of hours worked in a week: ");
//        double hoursWorked = input.nextDouble();
//        System.out.print("Enter hourly pay rate: ");
//        double hourlyPayRate = input.nextDouble();
//        System.out.print("Enter federal tax withholding rate: ");
//        double federalTaxRate = input.nextDouble();
//        System.out.print("Enter state tax withholding rate: ");
//        double stateTaxRate = input.nextDouble();
//        double grossPay, federal, state, totalDeduction;
//        System.out.printf("Employee Name: " + name + "\nHours Worked: " + hoursWorked + "\nPay rate: $" + hourlyPayRate + "\nGross Pay: $" + (grossPay = hoursWorked * hourlyPayRate) + "\nDeductions: \nFederal withholding (20.0%) $" + (federal = grossPay * federalTaxRate) + "\n state withholding(9.0%): $" + (state = grossPay * stateTaxRate) + "\n total deduction: $" + (totalDeduction = federal + state) + "\nNet pay: $" + (grossPay - totalDeduction));
//
//
//    }
//}
