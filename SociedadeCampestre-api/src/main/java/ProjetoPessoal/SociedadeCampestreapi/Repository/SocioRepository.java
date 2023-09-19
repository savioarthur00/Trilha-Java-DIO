package ProjetoPessoal.SociedadeCampestreapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

import ProjetoPessoal.SociedadeCampestreapi.model.Socio;


public interface SocioRepository extends JpaRepository<Socio, Integer> {

    // Query Method para encontrar sócios com base no nome
    List<Socio> findByNameContaining(String name);

    // Query Method para encontrar sócios com base no nome exato
    List<Socio> findByName(String name);

    // Query personalizada para filtrar sócios por nome
    @Query("SELECT s FROM Socio s WHERE s.name LIKE %:name%")
    List<Socio> filtrarPorNome(@Param("name") String name);

   
      // Query Method para encontrar um sócio com base no ID
    Optional<Socio> findById(Long id);
    
    @Modifying
    @Query("DELETE FROM Socio s WHERE s.id = ?1")
    void deletar(Integer id);
}
