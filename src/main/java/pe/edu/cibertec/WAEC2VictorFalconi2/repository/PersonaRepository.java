package pe.edu.cibertec.WAEC2VictorFalconi2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.WAEC2VictorFalconi2.model.bd.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}
