package com.anggun.chapter11.tugas;

public class Ex8_NewAccountclass {
    public static void main(String[] args) {
        Account2 account2 = new Account2("George", 1122, "1000");

        account2.setAnnualInterestRate(1.5);

        account2.deposit(30);
        account2.deposit(40);
        account2.deposit(50);

        account2.withdraw(5);
        account2.withdraw(4);
        account2.withdraw(2);

        System.out.println("       Account Summary");
        System.out.println("------------------------------------");
        System.out.println("Account holder name: " + account2.getName());
        System.out.println("Interest rate: " + account2.getAnnualInterestRate());
        System.out.printf("Balance: $%.2f\n", account2.getBalance());
        System.out.println("\n     List of transactions");
        System.out.println("------------------------------------");
        for (int i = 0; i < account2.getTransactions().size(); i++){
            System.out.println("Date: " +
                    (account2.getTransactions()).get(i).getDate());
            System.out.println("Type: " +
                    (account2.getTransactions()).get(i).getType());
            System.out.println("Amount: " +
                    (account2.getTransactions()).get(i).getAmount());
            System.out.println("Balance: " +
                    (account2.getTransactions()).get(i).getBalance());
            System.out.println("description: " +
                    (account2.getTransactions()).get(i).getDescription());
            System.out.println();
        }
    }
}
