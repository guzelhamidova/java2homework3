package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.deposit(20000));
        while (true){
            try {
                System.out.println(bankAccount.withDraw(6000));
            } catch (LimitException l){
                System.out.println(l.getMessage() + (bankAccount.getAmount() - bankAccount.getAmount()));
                break;
            }
        }
    }
}
