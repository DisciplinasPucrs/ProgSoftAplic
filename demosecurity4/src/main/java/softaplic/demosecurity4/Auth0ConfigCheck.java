package softaplic.demosecurity4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Auth0ConfigCheck {

    @Value("${auth0.domain}")
    private String domain;

    @Value("${auth0.audience}")
    private String audience;

    @PostConstruct
    public void init() {
        System.out.println("AUTH0 DOMAIN = " + domain);
        System.out.println("AUTH0 AUDIENCE = " + audience);
    }
}
