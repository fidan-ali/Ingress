package Payment;

public abstract class Payment {
    public void pay(double amount){
        System.out.println("You paid " + amount + "AZN.");
    }
}
