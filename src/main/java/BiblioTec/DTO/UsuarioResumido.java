package BiblioTec.DTO;

import java.util.List;


public class UsuarioResumido {
    private String nomeUsuario;
    private long idUsuario;
    List<String> emprestimos;
    List<String> Reservas;

    public UsuarioResumido(String nomeUsuario, long idUsuario, List<String> emprestimos, List<String> reservas) {
        this.nomeUsuario = nomeUsuario;
        this.idUsuario = idUsuario;
        this.emprestimos = emprestimos;
        Reservas = reservas;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<String> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<String> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public List<String> getReservas() {
        return Reservas;
    }

    public void setReservas(List<String> reservas) {
        Reservas = reservas;
    }
}
