package AuthenticationStrategy;

public class AuthService {
    public void login(AuthMethod method) {
        method.authenticate();
        System.out.println("You logged in successfully :)");
    }
}
