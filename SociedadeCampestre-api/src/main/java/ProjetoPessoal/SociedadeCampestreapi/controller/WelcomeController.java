package ProjetoPessoal.SociedadeCampestreapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Welcome to My Spring Boot Web API";
    }
    @GetMapping("/welcome/users")
    public String usersAutorizados() {
        return "Authorized user";
    }
    @GetMapping("/managers")
    public String managers() {
        return "Authorized manager";
    }
    @GetMapping("/welcome/socios")
    public String socios() {
        return "Socios autorizados pelo manager";
    }
    
}