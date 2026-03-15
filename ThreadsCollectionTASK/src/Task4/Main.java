package Task4;

public class Main {
    public static void main(String[] args) {

        BankQueue bank = new BankQueue();

        bank.addCustomer(new Customer(1,"Ali"));
        bank.addCustomer(new Customer(2,"Leyla"));
        bank.addCustomer(new Customer(3,"Murad"));

        System.out.println("\nQueue:");
        bank.showQueue();

        System.out.println("\nServing customer...");
        bank.serveCustomer();

        System.out.println("\nQueue after service:");
        bank.showQueue();
    }
}
