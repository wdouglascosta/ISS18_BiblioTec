package BiblioTec.Domain;

import BiblioTec.Domain.Enums.ItemStatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Livro")
@Table(name = "Livro")
public class Livro extends Item {
    @Column(name = "ISBN")
    private String isbn;

    public Livro() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


}