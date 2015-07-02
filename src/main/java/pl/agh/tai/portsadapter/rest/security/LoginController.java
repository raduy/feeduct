package pl.agh.tai.portsadapter.rest.security;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.agh.tai.portsadapter.rest.JsonResponse;
import pl.agh.tai.portsadapter.rest.security.user.AuthenticationService;

import java.util.Optional;

import static org.slf4j.LoggerFactory.getLogger;
import static org.springframework.http.MediaType.*;
import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * @author Lukasz Raduj 2015 raduj.lukasz@gmail.com.
 */
@RestController
@RequestMapping("/api/v1")
public class LoginController {
    private static final Logger LOG = getLogger(LoginController.class);

    private final AuthenticationService authenticationService;

    @Autowired
    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "/login", method = POST, consumes = APPLICATION_JSON_VALUE)
    public JsonResponse<AuthToken> doLogin(@RequestBody Credentials credentials) {
        Optional<AuthToken> tokenOptional = authenticationService.loginWithCredentials(credentials);

        return JsonResponse.ofSuccess(tokenOptional.orElseThrow(() -> new BadCredentialsException(credentials)));
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(BadCredentialsException.class)
    public JsonResponse handleBadCredentialsException(BadCredentialsException ex) {
        LOG.debug("No user of {} credentials found", ex.credentials());

        return JsonResponse.ofException(ex);
    }
}
