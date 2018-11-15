/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BiblioTec.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author andre
 */

@Entity
public class Emprestimo {

    @Id
    private Long ID;

    @OneToOne(mappedBy = "emprestimo")
    private Usuario usuario;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Emprestimo() {
    }
    
    
}
