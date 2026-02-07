package Payment;
import java.util.Scanner;

public class PayMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = Integer.parseInt(scanner.next());
        Payment payment;
        payment = new CreditCardPayment();
        payment.pay(100);
        payment = new PayPalPayment();
        payment.pay(200);

    }
}