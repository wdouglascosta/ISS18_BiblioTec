package BiblioTec.Domain;

import BiblioTec.BaseCRUD;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Entity(name = "Reserva")
@Table(name = "Reserva")
public class Reserva {
    private static final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva() {
        dateFormat.format(this.data);
        Calendar c = Calendar.getInstance();
        c.setTime(this.data);
        c.add(Calendar.DAY_OF_MONTH, 10);
        this.diaRetirada = c.getTime();
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

    @OneToOne
    private Livro livro;

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}