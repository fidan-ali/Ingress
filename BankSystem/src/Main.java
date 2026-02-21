public class Main {
    public static void main(String[] args) {

        try {
            SavingsAccount sa = new SavingsAccount(100, "Fidan", 1000);

            sa.withdraw(1200);
        } catch (InsufficientBalanceException e) {
            System.out.println("SavingsAccount Error: " + e.getMessage());
        }

        try {
            CurrentAccount ca = new CurrentAccount(200, "Ali", 1000);

            ca.withdraw(1300);
            System.out.println("Balance after 1300 withdraw: " + ca.getBalance());

            ca.withdraw(600); // Exception
        } catch (InsufficientBalanceException e) {
            System.out.println("CurrentAccount Error: " + e.getMessage());
        }

        Integer a = 100;
        Integer b = 100;

        System.out.println(a == b);
        System.out.println(a.equals(b));

        Integer x = 200;
        Integer y = 200;

        System.out.println(x == y);
        System.out.println(x.equals(y));
    }
}