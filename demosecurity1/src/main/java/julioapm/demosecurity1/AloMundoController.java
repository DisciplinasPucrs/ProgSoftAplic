package julioapm.demosecurity1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AloMundoController {
    @GetMapping("/alo")
    public String alo() {
        return "Alô, Mundo!";
    }
}
