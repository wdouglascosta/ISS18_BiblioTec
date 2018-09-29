package BiblioTec.Service;

import BiblioTec.Domain.Balconista;
import BiblioTec.Repository.BalconistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService extends ItemService<Livro, LivroRepository> {

    @Autowired
    public LivroService(LivroRepository repository) {
        super(repository);
    }
}
