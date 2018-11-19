package BiblioTec.API.Seed;

import BiblioTec.Domain.Livro;
import BiblioTec.Domain.Reserva;
import BiblioTec.Domain.Usuario;
import BiblioTec.Service.LivroService;
import BiblioTec.Service.ReservaService;
import BiblioTec.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ReservaSeed implements AppSeed {

    @Autowired
    private ReservaService reservaService;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private LivroService livroService;

    @Override
    public void loadSeed() throws IOException {

        if (reservaService.hasData()) {
            return;
        }
        Livro livro = new Livro();
        livro.setNome("A Laranja Mecânica");
        livro.setAutor("Antony Burgess");
        livroService.save(livro);


        Usuario usuarioSalvo = usuarioService.getById(2l);
        Usuario usuarioSalvo2 = usuarioService.getById(3l);


        Reserva reserva1 = new Reserva();
        reserva1.setUsuario(usuarioSalvo);

        reservaService.novaReserva(livro, usuarioSalvo);


        Livro livro1 = (Livro) livroService.getByName("O Auto").get(0);
        reservaService.novaReserva(livro1, usuarioSalvo2);




    }
}
