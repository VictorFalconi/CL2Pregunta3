package pe.edu.cibertec.WAEC2VictorFalconi2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.WAEC2VictorFalconi2.model.bd.Persona;
import pe.edu.cibertec.WAEC2VictorFalconi2.repository.PersonaRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class PersonaService implements IPersonaService{
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> listarPersonas() {
        return personaRepository.findAll();
    }
}

