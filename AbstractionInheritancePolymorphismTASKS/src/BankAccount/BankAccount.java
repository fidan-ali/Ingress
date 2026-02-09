package BankAccount;

public class BankAccount {
    String accountNumber;
    double balance;
    public BankAccount(){

    }
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit (double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Balans kifayət deyil!");
        }
    }
    public void displayInfo(){
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
