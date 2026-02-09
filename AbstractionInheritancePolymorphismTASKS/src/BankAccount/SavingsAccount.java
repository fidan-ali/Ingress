package BankAccount;

public class SavingsAccount extends BankAccount {
    int interestRate;
    public SavingsAccount(String interestRate, int accountNumber, double balance) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public void addInterest(){
        balance += balance * interestRate / 100;
    }
    @Override
    public void displayInfo() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest rate: " + interestRate + "%");
    }
}
