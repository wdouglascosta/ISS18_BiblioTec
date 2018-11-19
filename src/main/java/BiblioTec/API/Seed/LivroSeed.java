package BiblioTec.API.Seed;

import BiblioTec.Domain.Enums.ItemOrigem;
import BiblioTec.Domain.Enums.ItemStatus;
import BiblioTec.Domain.Livro;
import BiblioTec.Service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.Random;

@Component
public class LivroSeed implements AppSeed {
    private static final Random random = new Random(1);
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

        Livro livro2 = new Livro();
        livro2.setNome("O Auto da Compadecida");
        livro2.setAutor("Ariano Suassuna");
        livro2.setEdicao(7);
        livro2.setEditora("Globo");
        livro2.setAnoPublicacao(1978);
        livro2.setNumPaginas(98);

        service.save(livro1);
        service.save(livro2);

        Livro book = new Livro();
        List<Livro> inteligentInstances = VicAutoSeed.getInteligentInstances(book, 2);

        for (Livro livro : inteligentInstances) {
            if (livro.getStatus().equals(ItemStatus.INATIVADO)){
                livro.setMotivoInativacao(getmotivo());
            } else {
                livro.setMotivoInativacao("");
            }
            service.save(livro);

        }
    }

    private String getmotivo() {
        return MotivosInativacao.values()[random.nextInt(MotivosInativacao.values().length)].toString();
    }
}