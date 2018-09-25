package BiblioTec.Domain;

import javax.persistence.*;

@Entity(name = "Person")
@Table(name = "Person")
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "CPF")
    private String cpf;
    
    @Column(name = "RG")
    private String rg;
    
    @Column(name = "Sexo")
    private String sexo;
    
    @Column(name = "Endereco")
    private String endereco;
    
    @Column(name = "DataNasc")
    private String dataNascimento;
    
    @Column(name = "Email")
    private String email;
    
    @Column(name = "Telefone")
    private String telefone;
    
    @Column(name = "Ativo")
    private Boolean ativo;
    
    @Column(name = "TipoPessoa")
    private String tipoPessoa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public long getId() {
        return id;
    }

    public Person(long id, String nome, String cpf, String rg, String sexo, String endereco, String dataNascimento, String email, String telefone, Boolean ativo, String tipoPessoa) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        this.ativo = ativo;
        this.tipoPessoa = tipoPessoa;
    }

    public Person() {
    }
    
    
    

}