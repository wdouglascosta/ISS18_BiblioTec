package BiblioTec.Domain;

import javax.persistence.*;

//@Table(name = "Model")
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;

    @Column(name = "Ativo")
    protected boolean ativo;

    public Model() {
        this.ativo = true;
    }

    public long getId() {
        return id;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
