public class CurrentAccount extends BankAccount {

    private static final double OVERDRAFT_LIMIT = -500;

    public CurrentAccount(Integer accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {

        if (balance - amount < OVERDRAFT_LIMIT) {
            throw new InsufficientBalanceException("Overdraft limit exceeded!");
        }

        balance -= amount;
    }
}