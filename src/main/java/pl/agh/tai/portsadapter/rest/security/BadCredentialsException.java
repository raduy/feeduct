package pl.agh.tai.portsadapter.rest.security;

/**
 * @author Lukasz Raduj 2015 raduj.lukasz@gmail.com.
 */
public class BadCredentialsException extends RuntimeException {
    private final Credentials credentials;

    public BadCredentialsException(Credentials credentials) {
        super("No user with given credentials exists!");
        this.credentials = credentials;
    }

    public Credentials credentials() {
        return credentials;
    }
}
