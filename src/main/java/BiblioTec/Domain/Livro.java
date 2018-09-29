package BiblioTec.Domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Livro")
public class Livro extends Item{
    private String isbn;

    public Livro() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Livro(String isbn, long id, String nome, ItemStatus status, String autor, String editora, String origem, String motivoInativacao, int edicao, int volume, int anoPublicacao, int numPaginas, float valorMultaDiaAtraso) {
        super(id,  nome, status, autor, editora, origem, motivoInativacao edicao, volume, anoPublicacao, numPaginas, valorMultaDiaAtraso);
        this.isbn = isbn;
    }
}