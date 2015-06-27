package pl.agh.tai.portsadapter.rest.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author Lukasz Raduj 2015 raduj.lukasz@gmail.com.
 */
public class FeeductUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new FeeductUserDetails(s);
    }
}
