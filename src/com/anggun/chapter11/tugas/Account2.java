package com.anggun.chapter11.tugas;
import java.util.Date;
import java.util.ArrayList;
public class Account2 {
    private String name;
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;

    Account2(String george, int id, String s) {
        name = "";
        this.id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
        transactions = new ArrayList<Transaction>();
    }
    Account2(int id, double balance){
        name = "";
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<Transaction>();
    }
    Account2(String name, int id, double balance){
        this(id, balance);
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return  name;
    }
    public void setId(int id){
        this.id = id;
    }
    public  void setBalance(double balance){
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public  int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public String getDateCreated(){
        return dateCreated.toString();
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;

    }
    public double getMonthlyInterest(){
        return balance * (getMonthlyInterestRate() / 100);
    }
    public void withdraw (double amount){
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance, "Withdraw from account"));

    }
    public void deposit(double amount){
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, "deposit to account"));
    }
    public ArrayList<Transaction> getTransactions(){
        return transactions;
    }
}
