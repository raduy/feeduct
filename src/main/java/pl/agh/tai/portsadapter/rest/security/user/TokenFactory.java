package pl.agh.tai.portsadapter.rest.security.user;

import org.springframework.stereotype.Component;
import pl.agh.tai.portsadapter.rest.security.AuthToken;

import java.util.UUID;

/**
 * @author Lukasz Raduj 2015 raduj.lukasz@gmail.com.
 */
@Component
public class TokenFactory {

    public AuthToken nextToken() {
        return new AuthToken(UUID.randomUUID().toString());
    }
}
