package softaplic.demosecurity4;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AloMundoController {

    @GetMapping("/public")
    public String ola() {
        return "Olá, Mundo!";
    }

    @GetMapping("/protected")
    public String alo(Authentication authentication) {
        //Auth0AuthenticationToken auth0Token = (Auth0AuthenticationToken) authentication;
        var name = authentication.getName();
        //var scopes = auth0Token.getAuthorities();
        return "Alô, " + name + "!";
    }

}
