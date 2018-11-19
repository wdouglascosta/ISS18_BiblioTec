/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BiblioTec.Domain;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Entity(name = "Emprestimo")
@Table(name = "Emprestimo")
public class Emprestimo {
    private static final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    @OneToOne(fetch = FetchType.EAGER)
    private Usuario usuario;

    @OneToOne(fetch = FetchType.EAGER)
    private Livro livro;

    @Column(name = "data")
    private Date data = new Date();

    @Column(name = "dataDevolucao")
    private Date dataDevolucao;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Long getID() {
        return ID;
    }


    public Emprestimo() {
        dateFormat.format(this.data);
        Calendar c = Calendar.getInstance();
        c.setTime(this.data);
        c.add(Calendar.DAY_OF_MONTH, 10);
        this.dataDevolucao = c.getTime();
    }
    
    
}
