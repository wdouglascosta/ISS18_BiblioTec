package BiblioTec.Domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Academico")
public class Academico extends Item{
    private String modalidade;

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public Academico() {
    }

    public Academico(String modalidade, long id, String nome, ItemStatus status, String autor, String editora, String origem, String motivoInativacao, int edicao, int volume, int anoPublicacao, int numPaginas, float valorMultaDiaAtraso) {
        super(id,  nome, status, autor, editora, origem, motivoInativacao edicao, volume, anoPublicacao, numPaginas, valorMultaDiaAtraso);
        this.modalidade = modalidade;
    }
}