package BiblioTec.Domain;

import BiblioTec.Domain.Enums.ItemOrigem;
import BiblioTec.Domain.Enums.ItemStatus;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Livro")
@Table(name = "Livro")
public class Livro extends Item {
    @Column(name = "ISBN")
    private String isbn;

    public Livro() {
        super.setOrigem(ItemOrigem.COMPRA);
        super.setStatus(ItemStatus.DISPONIVEL);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


}