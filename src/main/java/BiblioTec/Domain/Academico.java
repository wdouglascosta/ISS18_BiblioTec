package BiblioTec.Domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Academico")
public class Academico extends Item {
    private String modalidade;

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public Academico() {
    }


}