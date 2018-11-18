package BiblioTec.Domain;

import javax.persistence.*;
import java.util.List;

/**
 *
 * @author andre
 */
@Entity
@Table(name = "Usuario")
public class Usuario extends Pessoa {

    private String situacao;

    private String detalhesInadimplencia;

    @OneToOne
    private Emprestimo emprestimo;

    @OneToMany
    private List<Emprestimo> emprestimos;

    public Usuario(String nome, String cpf, String rg) {
        super(nome, cpf, rg);
    }

  
    
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

    @Override
    public String toString() {
        return this.getNome() + " - id: " + this.getId();
    }

    public static Builder build() {
        return new Builder();
    }

    static final class Builder {

        public CpfStep nome(String nome) {
            return new UsuarioStepBuilder(nome);
        }


        class UsuarioStepBuilder implements RgStep, CpfStep, UsuarioBuild {
            private String nome;
            private String cpf;
            private String rg;

            public UsuarioStepBuilder(String nome) {
                this.nome = nome;
            }

            public RgStep cpf(String cpf) {
                this.cpf = cpf;
                return this;
            }

            public UsuarioBuild rg(String rg) {
                this.rg = rg;
                return this;
            }

            public Usuario build() {
                return new Usuario(nome, cpf, rg);
            }

        }


        interface CpfStep {
            RgStep cpf(String cpf);
        }

        interface RgStep {
            UsuarioBuild rg(String rg);
        }

        interface UsuarioBuild {
            Pessoa build();
        }
    }


}
