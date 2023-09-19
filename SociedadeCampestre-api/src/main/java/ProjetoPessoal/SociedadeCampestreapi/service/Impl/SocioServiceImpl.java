package ProjetoPessoal.SociedadeCampestreapi.service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProjetoPessoal.SociedadeCampestreapi.Repository.ContatoRepository;
import ProjetoPessoal.SociedadeCampestreapi.Repository.EnderecoRepository;
import ProjetoPessoal.SociedadeCampestreapi.Repository.SocioRepository;
import ProjetoPessoal.SociedadeCampestreapi.model.Contato;
import ProjetoPessoal.SociedadeCampestreapi.model.Endereco;
import ProjetoPessoal.SociedadeCampestreapi.model.Socio;
import ProjetoPessoal.SociedadeCampestreapi.service.SocioService;
import ProjetoPessoal.SociedadeCampestreapi.service.ViaCepService;

@Service
public class SocioServiceImpl  implements SocioService{
	
	@Autowired
	private SocioRepository socioRepository;
	
	@Autowired 
	private ContatoRepository contatoRepository;
	
	@Autowired 
	private EnderecoRepository enderecoRepository;
	
	@Autowired ViaCepService viaCepService;

	@Override
	public Iterable<Socio> buscarTodos() {
		return socioRepository.findAll();
	}

	@Override
	public Socio buscarporId(Long id) {
	Optional<Socio> socio= socioRepository.findById(id);
		return socio.get();
	}

	@Override
	public void inserir(Socio socio) {
		salvandoSocionoBDcmCeP(socio);
				
		
	}

	@Override
	public void atualizar(Long id, Socio socio) {
		Optional<Socio> socioBd= socioRepository.findById(id);
		
		if(socioBd.isPresent()) {
			salvandoSocionoBDcmCeP(socio);			
		}	
	}
 
	@Override
	public void deletar(Integer id) {
		socioRepository.deleteById(id);
		
	}
	
	private void salvandoSocionoBDcmCeP(Socio socio) {
		String cep = socio.getEndereco().getCep();			
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(()->{				
			Endereco novoEndereco=viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});			
		socio.setEndereco(endereco);
		Contato contato  = contatoRepository.findById(socio.getContato().getCelular()).orElseGet(()->{
			return null;
		});
		socio.setContato(contato);			
		socioRepository.save(socio);
	}
	

}
