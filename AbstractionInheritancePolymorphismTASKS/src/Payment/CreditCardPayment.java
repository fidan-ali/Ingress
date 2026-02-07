package Payment;

public class CreditCardPayment extends Payment{
    @Override
    public void pay(double amount) {
        System.out.println("You paid " + amount + "AZN with credit card.");
    }
}
