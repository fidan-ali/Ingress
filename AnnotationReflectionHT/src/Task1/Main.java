package Task1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User validUser = new User("Emin", 21);
        User invalidUser = new User("Nuray", 13);

        System.out.println("--- 1-ci Userin Testi ---");
        try {
            Validator.validate(validUser);
            System.out.println("18+ dur");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- 2-ci Userin Testi ---");
        try {
            Validator.validate(invalidUser);
            System.out.println("18+ dur");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}