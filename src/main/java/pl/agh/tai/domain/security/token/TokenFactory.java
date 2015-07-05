package pl.agh.tai.domain.security.token;

import org.springframework.stereotype.Component;

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
