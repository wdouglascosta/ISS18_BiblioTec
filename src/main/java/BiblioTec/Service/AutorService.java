package BiblioTec.Service;

import BiblioTec.Domain.Autor;
import BiblioTec.Repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author andre
 */
@Service
public class AutorService extends PessoaService<Autor, AutorRepository> {

    @Autowired
    public AutorService(AutorRepository repository) {
        super(repository);
    }
}
