package pl.agh.tai.portsadapter.rest.security.user;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Lukasz Raduj 2015 raduj.lukasz@gmail.com.
 */
@Entity
public class User {
    @Id
    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String email() {
        return email;
    }

    public String password() {
        return password;
    }

    User() { //why JPA why
    }
}
