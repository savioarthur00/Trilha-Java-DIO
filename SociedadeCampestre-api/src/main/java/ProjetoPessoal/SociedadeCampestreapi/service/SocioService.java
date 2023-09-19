package ProjetoPessoal.SociedadeCampestreapi.service;

import org.springframework.stereotype.Service;

import ProjetoPessoal.SociedadeCampestreapi.model.Socio;



@Service
public interface SocioService {
	
	Iterable<Socio> buscarTodos();
	
	Socio buscarporId(Long id);
	
	void inserir(Socio socio);
	
	void atualizar(Long id,Socio contato);
	
	void deletar(Integer id);

}
