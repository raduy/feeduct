package pl.agh.tai.domain.security.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.Optional;

import static com.google.common.base.Preconditions.checkNotNull;
import static java.util.Objects.nonNull;

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

    public Optional<User> loadByEmail(@NotNull String email) {
        checkNotNull(email, "When loading user for repository email cannot be null");
        return Optional.ofNullable(userDao.findOne(email));
    }

    public void saveUnique(@NotNull User user) {
        checkNotNull(user, "User for save cannot be null");
        User existing = userDao.findOne(user.email());
        if (nonNull(existing)) {
            throw new UserAlreadyExistsException(user.email());
        }
        userDao.save(user);
    }
}
