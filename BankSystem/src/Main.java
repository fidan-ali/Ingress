//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InsufficientBalanceException {
        Integer a = 100;
        Integer b = 100;

        System.out.println(a == b);
        System.out.println(a.equals(b));

        Integer x = 200;
        Integer y = 200;

        System.out.println(x == y);
        System.out.println(x.equals(y));

        SavingsAccount account1 = new SavingsAccount(1000, "Laman", 1);
        account1.withdraw(1200);

        CurrentAccount account = new CurrentAccount(1000, "Fidan", 2);
        account.withdraw(1300);
        account.withdraw(600);

    }
}