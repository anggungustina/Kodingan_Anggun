package com.anggun.chapter9.tugas;
import java.util.Date;
public class Account {
    private int id;
    private double balance;
    private static double annualInteretRate;
    private Date dateCreated;

    Account() {
        id = 0;
        balance = 0;
        annualInteretRate = 0;
        dateCreated = new Date();
    }
    Account (int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        dateCreated = new Date();
    }
    public void setId(int newId) {
        id = newId;
    }
    public void setBalance(double newBalance) {
        balance = newBalance;
    }
    public void setAnnualInteretRate(double newAnnualInterestRate) {
        annualInteretRate = newAnnualInterestRate;
    }
    public int getId() {
        return  id;
    }
    public double getBalance(){
        return  balance;
    }
    public double getAnnualInteretRate() {
        return annualInteretRate;

    }
    public String getdateCreated() {
        return dateCreated.toString();
    }
    public double getMonthlyInterestRate(){
        return  annualInteretRate / 12;
    }
    public double getMonthlyInterst(){
        return balance * (getMonthlyInterestRate() / 100);
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void  deposit(double amount) {
        balance += amount;
    }
}
