package pl.agh.tai.portsadapter.rest.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.agh.tai.portsadapter.rest.security.user.AuthenticationService;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.springframework.http.HttpStatus.UNAUTHORIZED;

@Component
public class SecurityInterceptor implements Filter {
    private final static String AUTH_HEADER = "Authorization";
    private final AuthenticationService authService;

    @Autowired
    public SecurityInterceptor(AuthenticationService authService) {
        this.authService = authService;
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest request = (HttpServletRequest) req;

        if (isLoginRequest(request)) {
            //allow access
            chain.doFilter(req, res);
            return;
        }

        String header = request.getHeader(AUTH_HEADER);

        if (header == null || !authService.isTokenValid(header.split("\\s+")[1])) {
            response.setStatus(UNAUTHORIZED.value());
            return;
        }
        chain.doFilter(req, res);
    }

    private boolean isLoginRequest(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        return requestURI.contains("login") || requestURI.contains("register");
    }

    @Override
    public void init(FilterConfig filterConfig) {
    }

    @Override
    public void destroy() {
    }
}