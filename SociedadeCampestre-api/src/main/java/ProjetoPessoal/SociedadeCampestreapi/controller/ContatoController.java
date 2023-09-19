package ProjetoPessoal.SociedadeCampestreapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProjetoPessoal.SociedadeCampestreapi.model.Contato;
import ProjetoPessoal.SociedadeCampestreapi.service.ContatoService;

@RestController
@RequestMapping("/contatos")
public class ContatoController {
	
	@Autowired
	private ContatoService contatoService;
	
	@GetMapping
	public ResponseEntity<Iterable<Contato>> buscarTodos(){
		return ResponseEntity.ok(contatoService.buscarTodos());
	}
	
	@GetMapping("/{id}")
	private ResponseEntity<Contato> buscarPorId(@PathVariable String id){
		return ResponseEntity.ok(contatoService.buscarporId(id));
	}
	
	 
    @PostMapping
    public ResponseEntity<Contato> inserir(@RequestBody Contato contato){
        contatoService.inserir(contato);
        return ResponseEntity.ok(contato);
    }
   
    
    @PutMapping("/{id}")
    public ResponseEntity<Contato> atualizar( @PathVariable String id, @RequestBody Contato contato){
        contatoService.atualizar(id, contato);
        return ResponseEntity.ok(contato);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Contato> deletar(@PathVariable String id){
    	contatoService.deletar(id);
    	return ResponseEntity.ok().build();
    }
    
    
	
	
	
	
	
	

}
