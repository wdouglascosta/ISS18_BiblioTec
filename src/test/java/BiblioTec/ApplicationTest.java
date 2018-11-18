package BiblioTec;

import BiblioTec.Service.UsuarioService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private UsuarioService usuarioService;

    @Test
    public void testeTest(){
        System.out.println("Teste do Spring");
    }

    @Test
    public void testeInjecao(){
        assertNotNull(usuarioService);
    }

    @Test
    public void testeService(){
        String valor = "teste Service";
        valor = usuarioService.testService(valor);
        assertEquals(valor, "teste Service - Ok!");
        System.out.println(valor);
    }
}
