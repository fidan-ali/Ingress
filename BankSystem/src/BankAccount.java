public abstract class BankAccount {
    public BankAccount(Integer accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    private Integer accountNumber;
    private String ownerName;
    protected double balance;

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }


    public abstract void deposit(double amount);
    public abstract void withdraw(double amount) throws InsufficientBalanceException; //throws InsufficientBalanceException
    public double getBalance(){
        return balance;
    };
}
