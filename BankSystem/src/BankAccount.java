public abstract class BankAccount {

    private Integer accountNumber;
    private String ownerName;
    protected double balance;

    public BankAccount(Integer accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount) throws InsufficientBalanceException;

    public double getBalance() {
        return balance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return "AccountNumber: " + accountNumber +
                ", Owner: " + ownerName +
                ", Balance: " + balance;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof BankAccount)) return false;

        BankAccount other = (BankAccount) obj;
        return accountNumber.equals(other.accountNumber);
    }

    @Override
    public int hashCode() {
        return accountNumber.hashCode();
    }
}