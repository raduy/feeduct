package pl.agh.tai.portsadapter.rest.security.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author Lukasz Raduj 2015 raduj.lukasz@gmail.com.
 */
@Component
public class UserRepository {
    private final UserDao userDao;

    @Autowired
    public UserRepository(UserDao userDao) {
        this.userDao = userDao;

        saveUnique(new User("luk", "rad"));
    }

    public Optional<User> loadByEmail(String email) {
        return Optional.ofNullable(userDao.findOne(email));
    }

    public void saveUnique(User user) {
        userDao.save(user);
    }
}
