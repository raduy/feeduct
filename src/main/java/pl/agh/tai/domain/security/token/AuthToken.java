package pl.agh.tai.domain.security.token;

/**
 * @author Lukasz Raduj 2015 raduj.lukasz@gmail.com.
 */
public class AuthToken {
    private String token;

    public AuthToken(String token) {
        this.token = token;
    }

    public String token() {
        return token;
    }
}
