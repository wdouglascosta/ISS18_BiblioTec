package BiblioTec;

import BiblioTec.Domain.Emprestimo;
import BiblioTec.Domain.Livro;
import BiblioTec.Domain.Usuario;
import BiblioTec.Service.EmprestimoService;
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
public class EmprestimoTest {
    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private LivroService livroService;

    @Autowired
    private EmprestimoService emprestimoService;

    Usuario usuario = new Usuario();
    Livro livro = new Livro();

    @Before
    public void setup(){

        usuario.setNome("Teste Teste Emprestimo");
        usuario.setCpf("592.800.880-50");
        usuario = usuarioService.save(usuario);


        livro.setNome("O livro de testes para Emprestimo");
        livro.setAutor("O autor de testes para Emprestimo");
        livro = livroService.save(livro);
    }

    @Test
    public void criarEmprestimo(){
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setLivro(livro);
        emprestimo.setUsuario(usuario);
        emprestimo = emprestimoService.save(emprestimo);

        assertEquals(emprestimoService.getById(emprestimo.getID()).getLivro().getNome(), emprestimo.getLivro().getNome());
        emprestimoService.delete(emprestimo.getID());
    }

    @After
    public void finish(){
        usuarioService.deletePermanent(usuario.getId());
        livroService.deletePermanent(livro.getId());
    }
}
