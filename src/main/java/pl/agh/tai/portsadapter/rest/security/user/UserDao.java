package pl.agh.tai.portsadapter.rest.security.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * @author Lukasz Raduj 2015 raduj.lukasz@gmail.com.
 */
@Component
public interface UserDao extends CrudRepository<User, String> {
}
