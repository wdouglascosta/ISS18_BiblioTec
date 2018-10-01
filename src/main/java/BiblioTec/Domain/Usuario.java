package BiblioTec.Domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;

@Entity
@Table(name = "Usuario")
public class Usuario extends Pessoa {

    private String nomeUsuario;
    private String senha;
    private Date ultimoAcesso;

    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Date getUltimoAcesso() {
        return ultimoAcesso;
    }
    public void setUltimoAcesso(Date ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }

    private String situacao;

    private String detalhesInadimplencia;

    @OneToOne
    private Emprestimo emprestimo;

    @OneToMany
    private List<Emprestimo> emprestimos;


    public Usuario() {
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDetalhesInadimplencia() {
        return detalhesInadimplencia;
    }

    public void setDetalhesInadimplencia(String detalhesInadimplencia) {
        this.detalhesInadimplencia = detalhesInadimplencia;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }


    public Usuario(String situacao, String detalhesInadimplencia, Emprestimo emprestimo, List<Emprestimo> emprestimos, List reservas, long id, String nome, String cpf, String rg, String sexo, String endereco, String dataNascimento, String email, String telefone, Boolean ativo, String tipoPessoa) {
        super(id, nome, cpf, rg, sexo, endereco, dataNascimento, email, telefone, ativo, tipoPessoa);
        this.situacao = situacao;
        this.detalhesInadimplencia = detalhesInadimplencia;
        this.emprestimo = emprestimo;
        this.emprestimos = emprestimos;
    }

}
