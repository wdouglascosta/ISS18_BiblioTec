package BiblioTec.API.Seed;

import BiblioTec.Domain.Livro;
import BiblioTec.Service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class UsuarioSeed implements AppSeed {
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

        service.save(livro1);
    }
}