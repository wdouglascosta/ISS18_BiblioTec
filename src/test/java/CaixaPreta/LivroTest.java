package CaixaPreta;


import BiblioTec.Domain.Livro;

import static org.junit.Assert.*;

import org.junit.Test;


public class LivroTest {

    @Test
    public void testando() {
        System.out.println("----------->   teeeeeesteeeeeee");

    }
    @Test
    public void criaLivro() {
        Livro livro = new Livro();
        livro.setNome("Harry Potter");

        //os metodos assert* são do JUnit, e servem para verificar o valor do objeto com o esperado,
        //um teste só "passa" se os valores corresponderem
        assertEquals(livro.getNome(), "Harry Potter");
    }
}
