package pl.agh.tai.domain.security.token

import spock.lang.Specification
import spock.lang.Subject

/**
 * @author Lukasz Raduj 2015 raduj.lukasz@gmail.com.
 */
class TokenCacheTest extends Specification {

    @Subject
    TokenCache underTest = new TokenCache()

    TokenFactory tokenFactory = new TokenFactory()

    def "TokenCache should remember persisted token"() {
        given:
        AuthToken authToken = tokenFactory.nextToken()

        when:
        underTest.add(authToken)

        then:
        underTest.load(authToken.token()).isPresent()
    }

    def "Cache should remove token after invalidation"() {
        given:
        AuthToken authToken = tokenFactory.nextToken()
        underTest.add(authToken)

        when:
        underTest.invalidate(authToken.token())

        then:
        !underTest.load(authToken.token()).isPresent()
    }
}
