package julioapm.demosecurity2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AloMundoController {
    @GetMapping("/alo")
    public String alo() {
        return "Alô, Mundo!";
    }

    @GetMapping("/ola")
    public String ola() {
        return "Olá, Mundo!";
    }
}
