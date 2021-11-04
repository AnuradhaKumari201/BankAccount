package com.knoldus;

public class BankAccount {

     String accountNumber;
       Double balance;


    public BankAccount(String s, double v) {

        accountNumber =s;
        balance=v;


    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Double getBalance() {
        return balance;
    }





    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}




