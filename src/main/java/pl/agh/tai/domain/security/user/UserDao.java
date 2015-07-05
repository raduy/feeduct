package pl.agh.tai.domain.security.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import pl.agh.tai.domain.security.user.User;

/**
 * @author Lukasz Raduj 2015 raduj.lukasz@gmail.com.
 */
@Component
public interface UserDao extends CrudRepository<User, String> {
}
