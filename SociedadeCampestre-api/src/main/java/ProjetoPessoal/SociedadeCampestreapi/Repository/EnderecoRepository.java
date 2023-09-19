package ProjetoPessoal.SociedadeCampestreapi.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ProjetoPessoal.SociedadeCampestreapi.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
