package pl.agh.tai.domain.security.token;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

import static java.util.Objects.isNull;

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

    public Optional<AuthToken> load(String token) {
        if (isNull(token)) {
            return Optional.empty();
        }
        return Optional.ofNullable(cache.getIfPresent(token));
    }

    public void invalidate(String authToken) {
        cache.invalidate(authToken);
    }
}
