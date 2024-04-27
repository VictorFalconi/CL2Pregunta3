package pe.edu.cibertec.WAEC2VictorFalconi2.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "cuenta")
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcuenta;
    private String nrocuenta;
    private Date fecharegistro;
    private Date fechavencimiento;
    @ManyToOne
    @JoinColumn(name = "idpersona")
    private Persona persona;
}
