package designPatterns.strategyPractice;

public class UPIPaymentStrategy implements PaymentStrategy{
    private int amount;
    public void UPIPaymentStrategy(int amount){
        this.amount = amount;

    }
    @Override
    public void pay(int amount){
        System.out.println("Inside credit card payment "+ amount);
    }
}
