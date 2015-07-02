package pl.agh.tai.portsadapter.rest.security.user;

import static java.lang.String.*;

/**
 * @author Lukasz Raduj 2015 raduj.lukasz@gmail.com.
 */
public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String email) {
        super(format("User with email '%s' already exists!", email));
    }
}
