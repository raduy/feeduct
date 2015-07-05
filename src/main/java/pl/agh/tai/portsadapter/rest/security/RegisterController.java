package pl.agh.tai.portsadapter.rest.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.agh.tai.portsadapter.rest.JsonResponse;
import pl.agh.tai.domain.security.user.User;
import pl.agh.tai.domain.security.user.UserAlreadyExistsException;
import pl.agh.tai.domain.security.user.UserRepository;

import static org.springframework.http.HttpStatus.CONFLICT;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


/**
 * @author Lukasz Raduj 2015 raduj.lukasz@gmail.com.
 */
@RestController
@RequestMapping("/api/v1")
public class RegisterController {

    private final UserRepository userRepository;

    @Autowired
    public RegisterController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @ResponseStatus(CREATED)
    @RequestMapping(value = "/register",
            method = POST,
            consumes = APPLICATION_JSON_VALUE)
    public JsonResponse<User> register(@RequestBody Credentials credentials) {
        User user = User.fromCredentials(credentials);
        userRepository.saveUnique(user);

        return JsonResponse.ofSuccess(user);
    }

    @ResponseStatus(CONFLICT)
    @ExceptionHandler(UserAlreadyExistsException.class)
    public JsonResponse handleDuplicatedEmail(UserAlreadyExistsException ex) {
        return JsonResponse.ofException(ex);
    }
}
