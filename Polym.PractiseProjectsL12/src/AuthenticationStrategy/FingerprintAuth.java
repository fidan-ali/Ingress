package AuthenticationStrategy;

public class FingerprintAuth implements AuthMethod{
    @Override
    public void authenticate() {
        System.out.println("Authenticating using fingerprint.");
    }
}
