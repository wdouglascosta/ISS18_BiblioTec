package BiblioTec.Domain;

import javax.persistence.*;

@Entity
@Table(name = "Item")

public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCatalogacao;

    @Column(name = "Titulo")
    private String titulo;

    @Column(name = "Autor")
    private String autor;

    @Column(name = "Editora")
    private String editora;

    @Column(name = "Volume")
    private String volume;

    @Column(name = "Edicao")
    private int edicao;

    @Column(name = "Categoria")
    private String categoria;

    @Column(name = "Origem")
    private String origem;

    @Column(name = "NroPaginas")
    private int nroPaginas;

    @Column(name = "AnoPublicacao")
    private int anoPublicacao;


    public long getIdCatalogacao() {
        return idCatalogacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Item() {
    }

    public Item(String titulo,
                String autor,
                String editora,
                String volume,
                int    edicao,
                String categoria,
                String origem,
                int    nroPaginas,
                int    anoPublicacao) {

        this.titulo        = titulo;
        this.autor         = autor;
        this.editora       = editora;
        this.volume        = volume;
        this.edicao        = edicao;
        this.categoria     = categoria;
        this.origem        = origem;
        this.nroPaginas    = nroPaginas;
        this.anoPublicacao = anoPublicacao;
    }
}


