package pl.agh.tai.portsadapter.rest.security;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Lukasz Raduj 2015 raduj.lukasz@gmail.com.
 */
public class Credentials {
    private final String email;
    private final String password;

    @JsonCreator
    public Credentials(@JsonProperty("email") String email,
                       @JsonProperty("password") String password) {
        this.email = email;
        this.password = password;
    }

    public String email() {
        return email;
    }

    public String password() {
        return password;
    }
}
