package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public double deposit(double sum){
        return amount=amount+sum;
    }

    public double withDraw(int sum) throws LimitException {
        if (sum > amount ){
            throw new LimitException("У Вас недостаточно денег на счету ",amount );
        }
        return amount= amount - sum;
    }
}
