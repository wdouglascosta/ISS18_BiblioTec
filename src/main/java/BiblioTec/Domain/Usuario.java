package BiblioTec.Domain;


import javax.persistence.*;

/**
 *
 * @author andre
 */
@Entity
@Table(name = "Usuario")
public class Usuario extends Person{

    private String situacao;
    
    private String detalhesInadimplencia;
    
    
}
