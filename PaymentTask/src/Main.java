import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();

            PaymentMethod payment;
            if (name.equalsIgnoreCase("payx")) {
                payment = new PayX();
            } else if (name.equalsIgnoreCase("payy")) {
                payment = new PayY();
            } else if (name.equalsIgnoreCase("payz")) {
                payment = new PayZ();
            } else {
                payment = new PaymentMethod();
            }

            payment.pay();
        }
    }
}