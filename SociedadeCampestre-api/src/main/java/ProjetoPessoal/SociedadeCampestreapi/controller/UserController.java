package ProjetoPessoal.SociedadeCampestreapi.controller;


import ProjetoPessoal.SociedadeCampestreapi.service.SecurityDatabaseService;
import ProjetoPessoal.SociedadeCampestreapi.model.User;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private SecurityDatabaseService service;
    @PostMapping
    public void postUser(@RequestBody User user){
        service.createUser(user);
        System.out.println("Usuario criado");
        System.out.println(user.getId());
        
    }
    
  
}