import javax.security.auth.login.AccountException;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(Integer accountNumber, String ownerName, double balance){
      super(accountNumber, ownerName,balance);
    };
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        try{
            balance-=amount;
            if(balance < 0){
                throw new InsufficientBalanceException("Insufficient Balance");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
