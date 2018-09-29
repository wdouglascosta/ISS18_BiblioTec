package BiblioTec.Service;

import BiblioTec.Domain.Livro;
import BiblioTec.Repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService extends ItemService<Livro, LivroRepository> {

    @Autowired
    public LivroService(LivroRepository repository) {
        super(repository);
    }
}
