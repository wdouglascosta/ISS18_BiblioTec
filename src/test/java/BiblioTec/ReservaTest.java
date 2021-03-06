package BiblioTec;

import BiblioTec.Domain.Livro;
import BiblioTec.Domain.Reserva;
import BiblioTec.Domain.Usuario;
import BiblioTec.Service.LivroService;
import BiblioTec.Service.ReservaService;
import BiblioTec.Service.UsuarioService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ReservaTest {
    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private LivroService livroService;

    @Autowired
    private ReservaService reservaService;

    Usuario usuario = new Usuario();
    Livro livro = new Livro();

    @Before
    public void setup(){

        usuario.setNome("Teste Teste");
        usuario.setCpf("498.004.570-70");
        usuario = usuarioService.save(usuario);

        livro.setNome("O livro de testes");
        livro.setAutor("O autor de testes");
        livro = livroService.save(livro);
    }

    @Test
    public void criarReserva(){
        Reserva reserva = new Reserva();
        reserva.setLivro(livro);
        reserva.setUsuario(usuario);
        reserva = reservaService.save(reserva);
        assertEquals(reserva.getLivro(), livro);
        assertEquals(reserva.getUsuario(), usuario);
        assertEquals(reservaService.getById(reserva.getId()).getUsuario().getNome(), reserva.getUsuario().getNome());
        reservaService.delete(reserva.getId());

    }

    @After
    public void finish(){
        usuarioService.deletePermanent(usuario.getId());
        livroService.deletePermanent(livro.getId());
    }



}
