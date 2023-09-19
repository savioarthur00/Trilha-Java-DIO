package ProjetoPessoal.SociedadeCampestreapi.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProjetoPessoal.SociedadeCampestreapi.model.Contato;
import ProjetoPessoal.SociedadeCampestreapi.service.ContatoService;


@Service
public class ContatoServiceImpl  implements ContatoService{

	@Autowired
	private ContatoService contatoService;
	
	@Override
	public Iterable<Contato> buscarTodos() {
		return contatoService.buscarTodos();
	}

	@Override
	public Contato buscarporId(String id) {
		
		return contatoService.buscarporId(id);
	}

	@Override
	public void inserir(Contato contato) {
		contatoService.inserir(contato);
		
	}

	@Override
	public void atualizar(String id, Contato contato) {
		Contato contatoAtual  =contatoService.buscarporId(id);
		contatoService.atualizar(id, contatoAtual);
		
		
	}

	@Override
	public void deletar(String id) {
		contatoService.deletar(id);
		
	}


}
