package BiblioTec.Domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Periodico")
public class Periodico extends Item{
    private String issn;
    private String tipoPeriodico;

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getTipoPeriodico() {
        return tipoPeriodico;
    }

    public void setTipoPeriodico(String tipoPeriodico) {
        this.tipoPeriodico = tipoPeriodico;
    }

    public Periodico() {
    }



}