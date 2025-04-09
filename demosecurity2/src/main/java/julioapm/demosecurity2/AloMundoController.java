package julioapm.demosecurity2;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AloMundoController {
    @GetMapping("/alo")
    public String alo(@AuthenticationPrincipal UserDetails userDetails) {
        return "Alô, " + userDetails.getUsername() + "!";
    }

    @GetMapping("/ola")
    public String ola() {
        return "Olá, Mundo!";
    }
}
