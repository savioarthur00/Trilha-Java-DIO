package ProjetoPessoal.SociedadeCampestreapi.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ProjetoPessoal.SociedadeCampestreapi.Repository.SocioRepository;
import ProjetoPessoal.SociedadeCampestreapi.model.Socio;

@RestController
@RequestMapping("/api/socios") 
public class SocioController {
    
    @Autowired
    private SocioRepository repository;
    
    @PostMapping
    public void post(@RequestBody Socio socio){
        repository.save(socio);
    }
    
    @PutMapping
    public void atualizarSocio(@RequestBody Socio socio){
        repository.save(socio);
    }
    
    @GetMapping
    public List<Socio> getAll(){
        return repository.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Socio> getOne(@PathVariable("id") Integer id){
        return repository.findById(id);
    }
}
