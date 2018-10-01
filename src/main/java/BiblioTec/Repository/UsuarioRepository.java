package BiblioTec.Repository;

import BiblioTec.Domain.Usuario;
import org.springframework.stereotype.Repository;

/**
 *
 * @author andre
 */
@Repository
public interface UsuarioRepository extends PessoaRepository<Usuario> {
}
