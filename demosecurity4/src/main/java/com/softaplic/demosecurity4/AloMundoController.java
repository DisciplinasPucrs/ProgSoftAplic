package com.softaplic.demosecurity4;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*" )
@RequestMapping("/api")
public class AloMundoController {

    @GetMapping("/public")
    public String ola() {
        return "Olá, Mundo!";
    }

    @GetMapping("/private")
    public String alo(@AuthenticationPrincipal UserDetails userDetails) {
        return "Alô, " + userDetails.getUsername() + "!";
    }

    @GetMapping("/private-scoped")
    public String aloScoped(@AuthenticationPrincipal UserDetails userDetails) {
        return "Alô, " + userDetails.getUsername() + "! (escopo read:messages)";
    }
}
