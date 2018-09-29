package BiblioTec.Service;

import BiblioTec.Domain.Bibliotecario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import BiblioTec.Repository.BibliotecarioRepository;

/**
 *
 * @author andre
 */
@Service
public class BibliotecarioService extends PessoaService<Bibliotecario, BibliotecarioRepository> {

    @Autowired
    public BibliotecarioService(BibliotecarioRepository repository) {
        super(repository);
    }
}
