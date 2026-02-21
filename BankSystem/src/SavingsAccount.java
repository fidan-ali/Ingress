public class SavingsAccount extends BankAccount {

    public SavingsAccount(Integer accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {

        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient balance in SavingsAccount");
        }

        balance -= amount;
    }
}