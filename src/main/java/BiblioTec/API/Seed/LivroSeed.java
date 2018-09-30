package BiblioTec.API.Seed;

import BiblioTec.Domain.Enums.ItemOrigem;
import BiblioTec.Domain.Enums.ItemStatus;
import BiblioTec.Domain.Livro;
import BiblioTec.Service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class LivroSeed implements AppSeed {
    @Autowired
    private LivroService service;

    @Override
    public void loadSeed() throws IOException {
        if (service.hasData()) {
            System.out.println("Banco já possui dados");
            return;
        }
        Livro livro1 = new Livro();
        livro1.setNome("Dom Casmurro");
        livro1.setAutor("Machado de Assis");
        livro1.setEdicao(22);
        livro1.setOrigem(ItemOrigem.COMPRA);
        livro1.setEditora("Belas Artes");
        livro1.setAnoPublicacao(1924);
        livro1.setNumPaginas(354);
        livro1.setStatus(ItemStatus.DISPONIVEL);

        service.save(livro1);
    }
}