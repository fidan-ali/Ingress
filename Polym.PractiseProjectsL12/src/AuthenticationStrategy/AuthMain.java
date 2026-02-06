package AuthenticationStrategy;

public class AuthMain {
    public static void main(String[] args) {
        AuthService authService = new AuthService();

        AuthMethod password = new PasswordAuth();
        AuthMethod fingerprint = new FingerprintAuth();
        AuthMethod faceId = new FaceIdAuth();

        authService.login(password);
        authService.login(fingerprint);
        authService.login(faceId);
    }
}
