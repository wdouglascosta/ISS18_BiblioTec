package BiblioTec.Domain;

import BiblioTec.BaseCRUD;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Reserva")
@Table(name = "Reserva")
public class Reserva {

    public Reserva() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "data")
    private Date data = new Date();

    @Column(name = "diaRetirada")
    private Date diaRetirada;

    @OneToOne
    private Usuario usuario;
}