package BankAccount;

public class BankMain {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("BA123", 1000);
        account1.deposit(500);
        account1.withdraw(200);
        account1.displayInfo();

        SavingsAccount account2 = new SavingsAccount("SA456", 2000, 5);
        account2.addInterest();
        account2.displayInfo();
    }
}
