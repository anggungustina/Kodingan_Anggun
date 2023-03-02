package com.anggun.chapter9.tugas;

public class Ex7_TheAccountclass {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);

        account.setAnnualInteretRate(4.5);

        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("\n           Account Statement");
        System.out.println("-----------------------------------------");
        System.out.println("Account ID: " + account.getId());
        System.out.println("Date created: " + account.getdateCreated());
        System.out.printf("Balancre: $%.2f\n", account.getBalance());
        System.out.printf("Monthly interest: $%.2f\n", account.getMonthlyInterst());
    }

}
