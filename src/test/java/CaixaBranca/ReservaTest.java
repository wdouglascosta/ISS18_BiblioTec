package CaixaBranca;

import BiblioTec.Domain.Enums.ItemStatus;
import BiblioTec.Domain.Livro;
import BiblioTec.Domain.Reserva;
import BiblioTec.Domain.Usuario;
import BiblioTec.Service.UsuarioService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class ReservaTest {



    Usuario usuario = new Usuario();
    Livro livro = new Livro();


    @Before
    public void setup() {
        usuario.setNome("William Douglas");
        usuario.setCpf("08101203990");
        usuario.setEndereco("Av. Cerro Azul, 2835");
        livro.setNome("Harry Potter");
        livro.setStatus(ItemStatus.DISPONIVEL);
    }

    @Test
    public void novaReserva() {
        Reserva reserva = new Reserva();
        reserva.setUsuario(usuario);
        livro.setReserva(reserva);
        assertEquals(reserva, livro.getReservas().get(0));
        livro.getReservas().clear();

    }

    @Test
    public void verificaStatus() {
        assertEquals(livro.getStatus(), ItemStatus.DISPONIVEL);
        Reserva reserva = new Reserva();
        reserva.setUsuario(usuario);
        livro.setReserva(reserva);
        assertEquals(livro.getStatus(), ItemStatus.RESERVADO);


    }


    @After
    public void finalizacao() {

    }


}
