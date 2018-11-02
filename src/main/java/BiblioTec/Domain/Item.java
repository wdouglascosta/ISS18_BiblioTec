package BiblioTec.Domain;

import BiblioTec.Domain.Enums.ItemOrigem;
import BiblioTec.Domain.Enums.ItemStatus;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Item")
@Table(name = "Item")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;

    @Column(name = "Ativo")
    protected boolean ativo = true;

    public long getId() {
        return id;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

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
    @Enumerated(EnumType.STRING)
    private ItemOrigem origem;

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

    @OneToMany
    @Column(name = "reservas")
    private List<Reserva> reservas = new ArrayList<>();

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

    public ItemOrigem getOrigem() {
        return origem;
    }

    public void setOrigem(ItemOrigem origem) {
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

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReserva(Reserva reserva){
        reservas.add(reserva);
    }

    public Item(Long id, String nome, ItemStatus status, String autor, String editora, ItemOrigem origem, String motivoInativacao, int edicao, int volume, int anoPublicacao, int numPaginas, float valorMultaDiaAtraso) {
        this.id = id;
        this.nome = nome;
        this.status = status;
        this.autor = autor;
        this.editora = editora;
        this.origem = origem;
        this.motivoInativacao = motivoInativacao;
        this.edicao = edicao;
        this.volume = volume;
        this.anoPublicacao = anoPublicacao;
        this.numPaginas = numPaginas;
        this.valorMultaDiaAtraso = valorMultaDiaAtraso;
    }

    /*
        public Item(long id, String nome, ItemStatus status, String autor, String editora, String origem, int edicao, int volume, int anoPublicacao, int numPaginas, float valorMultaDiaAtraso) {
            this.id = id;
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
        */
    public Item() {
    }
}
