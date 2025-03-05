package julioapm.testespringboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller {
    @GetMapping("teste")
    public String getTeste() {
        return "Teste do Spring Boot";
    }
    
}
