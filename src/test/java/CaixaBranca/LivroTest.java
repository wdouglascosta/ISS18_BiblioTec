package CaixaBranca;


import BiblioTec.Domain.Livro;

import static org.junit.Assert.*;

import BiblioTec.Service.BeanUtil;
import BiblioTec.Service.LivroService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class LivroTest {

//    private LivroService livroService = BeanUtil.getBean("livroService",LivroService.class);

    @Test
    public void testando() {
        System.out.println("----------->   teeeeeesteeeeeee");

    }
    @Test
    public void criaLivro() {
        Livro livro = new Livro();
        livro.setNome("Harry Potter");
        assertEquals(livro.getNome(), "Harry Potter");
    }
}
