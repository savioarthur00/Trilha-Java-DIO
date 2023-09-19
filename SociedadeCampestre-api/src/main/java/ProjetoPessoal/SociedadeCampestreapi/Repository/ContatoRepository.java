package ProjetoPessoal.SociedadeCampestreapi.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ProjetoPessoal.SociedadeCampestreapi.model.Contato;

@Repository
public interface ContatoRepository extends CrudRepository<Contato, String> {

}
