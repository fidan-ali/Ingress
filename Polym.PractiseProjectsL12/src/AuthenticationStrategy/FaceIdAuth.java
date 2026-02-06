package AuthenticationStrategy;

public class FaceIdAuth implements AuthMethod{
    @Override
    public void authenticate() {
        System.out.println("Authenticating using FaceID.");
    }
}
