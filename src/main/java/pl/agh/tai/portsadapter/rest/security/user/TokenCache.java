package pl.agh.tai.portsadapter.rest.security.user;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.springframework.stereotype.Component;
import pl.agh.tai.portsadapter.rest.security.AuthToken;

import java.util.concurrent.TimeUnit;

/**
 * @author Lukasz Raduj 2015 raduj.lukasz@gmail.com.
 */
@Component
public class TokenCache {

    private final Cache<String, AuthToken> cache = CacheBuilder.newBuilder()
            .expireAfterAccess(15, TimeUnit.MINUTES)
            .build();

    public void add(AuthToken authToken) {
        cache.put(authToken.token(), authToken);
    }

    public AuthToken load(String token) {
        return cache.getIfPresent(token);
    }
}
