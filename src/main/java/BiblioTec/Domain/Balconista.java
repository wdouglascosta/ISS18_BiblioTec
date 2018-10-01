/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BiblioTec.Domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author andre
 */
@Entity
@Table(name = "Balconista")
public class Balconista extends Pessoa{
    private String turnoTrabalho;

    public Balconista() {
    }

    public String getTurnoTrabalho() {
        return turnoTrabalho;
    }

    public void setTurnoTrabalho(String turnoTrabalho) {
        this.turnoTrabalho = turnoTrabalho;
    }

    public Balconista(String turnoTrabalho, long id, String nome, String cpf, String rg, String sexo, String endereco, String dataNascimento, String email, String telefone, Boolean ativo, String tipoPessoa) {
        super(id, nome, cpf, rg, sexo, endereco, dataNascimento, email, telefone, ativo, tipoPessoa);
        this.turnoTrabalho = turnoTrabalho;
    }


    
    
}
