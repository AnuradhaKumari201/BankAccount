package com.knoldus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//get account number where balance is less tham 500;
//Given an account number return the balance of the Account as a float value
//List of all the account, accountNumber

public class MainBankAccount {


    public static void main(String[] args) {

        List<BankAccount> list = new ArrayList<>();
        list.add(new BankAccount("123456", 234.7));
        list.add(new BankAccount("234567", 678));

        list.stream().filter(i -> i.balance < 500).map(i -> i.accountNumber).forEach(i -> System.out.println(i));
        System.out.println("Balance " + getBalance(list, "123456"));


    }

    public static float getBalance(List<BankAccount> list, String accountNumber) {
        Map<String, Double> map = new HashMap<>();
        for (BankAccount book : list) {
            map.put(book.getAccountNumber(), book.getBalance());
        }
       return  map.get(accountNumber).floatValue();
    }

}



