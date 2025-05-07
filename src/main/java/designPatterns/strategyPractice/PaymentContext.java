package designPatterns.strategyPractice;

public class PaymentContext {
    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void pay(int amount){
        this.paymentStrategy.pay(amount);
    }
}
