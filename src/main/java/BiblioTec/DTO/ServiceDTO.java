package BiblioTec.DTO;

import BiblioTec.Domain.Emprestimo;
import BiblioTec.Domain.Reserva;
import BiblioTec.Domain.Usuario;
import BiblioTec.Service.EmprestimoService;
import BiblioTec.Service.ReservaService;
import BiblioTec.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceDTO {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private EmprestimoService emprestimoService;

    @Autowired
    private ReservaService reservaService;


    public UsuarioResumido getUsuarioResumo(long id) {
        Usuario usuario = usuarioService.getById(id);

        List<String> emprestimos = new ArrayList<>();
        List<String> reservas = new ArrayList<>();

        for (Emprestimo emprestimo : emprestimoService.getEmprestimosByUsuario(usuario)) {
            emprestimos.add("ID: " + emprestimo.getID() + " | Data de Devolução: "
                    + emprestimo.getDataDevolucao() + " | Livro: "
                    + emprestimo.getLivro().getNome() + " | Autor: "
                    + emprestimo.getLivro().getAutor());
        }

        for (Reserva reserva : reservaService.getReservasByUsuario(usuario)) {
            reservas.add("ID: " + reserva.getId() + " | Data de Retirada: "
                    + reserva.getDiaRetirada() + " | Livro: "
                    + reserva.getLivro().getNome() + " | Autor: "
                    + reserva.getLivro().getAutor());
        }


        UsuarioResumido usuarioResumido = new UsuarioResumido(usuario.getNome(), usuario.getId(), emprestimos, reservas);
        return usuarioResumido;

    }
}

