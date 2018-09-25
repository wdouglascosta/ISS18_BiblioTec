package BiblioTec.Domain;

import BiblioTec.Domain.Enums.ItemStatus;

import javax.persistence.*;

@Entity(name = "Item")
@Table(name = "Item")
public abstract class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Status")
    @Enumerated(EnumType.STRING)
    private ItemStatus status;

    @Column(name = "Autor")
    private String autor;

    @Column(name = "Editora")
    private String editora;

    @Column(name = "Origem")
    private String origem;

    @Column(name = "MotivoInativacao")
    private String motivoInativacao;

    @Column(name = "Edicao")
    private int edicao;

    @Column(name = "Volume")
    private int volume;

    @Column(name = "AnoPublicacao")
    private int anoPublicacao;

    @Column(name = "numPaginas")
    private int numPaginas;

    @Column(name = "ValorMultaDiaAtraso")
    private float valorMultaDiaAtraso;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getMotivoInativacao() {
        return motivoInativacao;
    }

    public void setMotivoInativacao(String motivoInativacao) {
        this.motivoInativacao = motivoInativacao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public float getValorMultaDiaAtraso() {
        return valorMultaDiaAtraso;
    }

    public void setValorMultaDiaAtraso(float valorMultaDiaAtraso) {
        this.valorMultaDiaAtraso = valorMultaDiaAtraso;
    }

    public ItemStatus getStatus() {
        return status;
    }

    public void setStatus(ItemStatus status) {
        this.status = status;
    }

    public Item(String nome, ItemStatus status, String autor, String editora, String origem, int edicao, int volume, int anoPublicacao, int numPaginas, float valorMultaDiaAtraso) {
        this.nome = nome;
        this.status = status;
        this.autor = autor;
        this.editora = editora;
        this.origem = origem;
        this.edicao = edicao;
        this.volume = volume;
        this.anoPublicacao = anoPublicacao;
        this.numPaginas = numPaginas;
        this.valorMultaDiaAtraso = valorMultaDiaAtraso;
    }

    public Item() {
    }
}