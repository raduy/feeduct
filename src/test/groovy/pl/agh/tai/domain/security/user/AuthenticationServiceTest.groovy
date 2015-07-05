package pl.agh.tai.domain.security.user

import pl.agh.tai.domain.security.token.AuthToken
import pl.agh.tai.domain.security.token.TokenCache
import pl.agh.tai.domain.security.token.TokenFactory
import pl.agh.tai.portsadapter.rest.security.Credentials
import spock.lang.Specification
import spock.lang.Subject

/**
 * @author Lukasz Raduj 2015 raduj.lukasz@gmail.com.
 */
class AuthenticationServiceTest extends Specification {

    UserRepository userRepositoryMock = Mock(UserRepository)
    TokenFactory tokenFactory = new TokenFactory()
    TokenCache tokenCacheSpy = Spy(TokenCache)

    @Subject
    AuthenticationService underTest = new AuthenticationService(userRepositoryMock, tokenFactory, tokenCacheSpy)

    def "Should return new token for existing user"() {
        given:
        userRepositoryMock.loadByEmail('Mark') >> Optional.of(new User('Mark', 'admin1'))

        when:
        Optional<AuthToken> authTokenOptional = underTest.loginWithCredentials(new Credentials("Mark", "admin1"))

        then:
        authTokenOptional.isPresent()
        1 * tokenCacheSpy.add(_ as AuthToken)
    }
}
