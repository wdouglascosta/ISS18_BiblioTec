package BiblioTec.Service;

import BiblioTec.Domain.Usuario;
import BiblioTec.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author andre
 */
@Service
public class UsuarioService extends PessoaService<Usuario, UsuarioRepository> {

    @Autowired
<<<<<<< HEAD
    public UsuarioService(UsuarioRepository repository) {
        super(repository);
    }
=======
    private UsuarioRepository repository;

    @Autowired
    public UsuarioService(JpaRepository<Usuario, Long> repository) {
        super(repository);
    }

    public boolean hasData(){
        return repository.count() > 0;
    }

>>>>>>> afd93dd491240cbbcb8911692d51b7c0a04a2263
}
