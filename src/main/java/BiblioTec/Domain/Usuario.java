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

    public static Builder build() {
        return new Builder();
    }

    static final class Builder {

        public CpfStep nome(String nome) {
            return new PessoaStepBuilder(nome);
        }

        class PessoaStepBuilder implements RgStep, CpfStep, PessoaBuild {
            private String nome;
            private String cpf;
            private String rg;

            public PessoaStepBuilder(String nome) {
                this.nome = nome;
            }

            public RgStep cpf(String cpf) {
                this.cpf = cpf;
                return this;
            }

            public PessoaBuild rg(String rg) {
                this.rg = rg;
                return this;
            }



            public Pessoa build() {
                return new Usuario(nome, cpf, rg);
            }
        }


        interface CpfStep {
            RgStep cpf(String cpf);
        }

        interface RgStep {
            PessoaBuild rg(String rg);
        }

        interface PessoaBuild {
            Pessoa build();
        }
    }
    
}
