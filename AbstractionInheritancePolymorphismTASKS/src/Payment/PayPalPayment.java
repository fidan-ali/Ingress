package Payment;

public class PayPalPayment extends Payment{
    @Override
    public void pay(double amount) {
        System.out.println("You paid " + amount + "AZN via Paypal.");
    }
}
