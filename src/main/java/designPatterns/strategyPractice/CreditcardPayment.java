package designPatterns.strategyPractice;

import java.sql.SQLOutput;

public class CreditcardPayment implements PaymentStrategy{
    private int amount;

    public void  CreditcardPayment(int amount){
        this.amount = amount;

    }
    @Override
    public void pay(int amount){
        System.out.println("Inside credit card payment");

    }
}
