package pl.agh.tai.domain.security.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.agh.tai.domain.security.token.AuthToken;
import pl.agh.tai.domain.security.token.TokenCache;
import pl.agh.tai.domain.security.token.TokenFactory;
import pl.agh.tai.portsadapter.rest.security.Credentials;

import java.util.Optional;

/**
 * @author Lukasz Raduj 2015 raduj.lukasz@gmail.com.
 */
@Component
public class AuthenticationService {
    private final UserRepository userRepository;
    private final TokenFactory tokenFactory;
    private final TokenCache tokenCache;

    @Autowired
    public AuthenticationService(UserRepository userRepository, TokenFactory tokenFactory, TokenCache tokenCache) {
        this.userRepository = userRepository;
        this.tokenFactory = tokenFactory;
        this.tokenCache = tokenCache;
    }

    public Optional<AuthToken> loginWithCredentials(Credentials credentials) {
        return userRepository.loadByEmail(credentials.email())
                .filter(user -> user.password().equals(credentials.password()))
                .map(user -> {
                    AuthToken authToken = tokenFactory.nextToken();
                    tokenCache.add(authToken);
                    return authToken;
                });
    }

    public boolean isTokenValid(String header) {
        Optional<AuthToken> authToken = tokenCache.load(header);
        return authToken.isPresent();
    }

    public void doLogout(String authToken) {
        tokenCache.invalidate(authToken);
    }
}
