package designPatterns.strategyPractice;

public class Main {
 public static void main(String[] args){
     PaymentContext context = new PaymentContext();
     context.setPaymentStrategy(new CreditcardPayment());
     context.pay(10);

 }

}
