package pe.edu.cibertec.WAEC2VictorFalconi2.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.WAEC2VictorFalconi2.model.bd.Persona;
import pe.edu.cibertec.WAEC2VictorFalconi2.service.IPersonaService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/persona")
public class PersonaController {
    private IPersonaService iPersonaService;

    @GetMapping("")
    public ResponseEntity<List<Persona>> listarPersonas() {
        return new ResponseEntity<>(
                iPersonaService.listarPersonas(),
                HttpStatus.OK
        );
    }
}
