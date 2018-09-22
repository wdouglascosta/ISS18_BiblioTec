package BiblioTec.Service;

import BiblioTec.Domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author andre
 */
@Service
public class UsuarioService extends ServiceBase<Usuario, Long> {

    @Autowired
    public UsuarioService(JpaRepository<Usuario, Long> repository) {
        super(repository);
    }

}
