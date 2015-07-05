package pl.agh.tai.domain.security.user

import spock.lang.Specification
import spock.lang.Subject

/**
 * @author Lukasz Raduj 2015 raduj.lukasz@gmail.com.
 */
class UserRepositoryTest extends Specification {

    UserDao userDaoMock = Mock(UserDao)

    @Subject
    UserRepository underTest = new UserRepository(userDaoMock)

    def "Should add new user when no one with the same name exists"() {
        given:
        userDaoMock.findOne('Eric') >> null

        when:
        underTest.saveUnique(new User('Eric', 'pass13'))

        then:
        notThrown(UserAlreadyExistsException)
        1 * userDaoMock.findOne('Eric')

    }

    def "Should throw exception when trying to duplicate user"() {
        given:
        userDaoMock.findOne('Eric') >> new User('Eric', 'posswords')

        when:
        underTest.saveUnique(new User('Eric', 'rhymtic'))

        then:
        thrown(UserAlreadyExistsException)
    }
}
