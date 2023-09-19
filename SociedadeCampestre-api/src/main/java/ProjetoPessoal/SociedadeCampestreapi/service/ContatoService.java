package ProjetoPessoal.SociedadeCampestreapi.service;



import org.springframework.stereotype.Service;

import ProjetoPessoal.SociedadeCampestreapi.model.Contato;

@Service
public interface ContatoService {
	
	Iterable<Contato> buscarTodos();
	
	Contato buscarporId(String id);
	
	void inserir(Contato contato);
	
	void atualizar(String id,Contato contato);
	
	void deletar(String id);
	

}
