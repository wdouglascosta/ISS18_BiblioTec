package BiblioTec.Repository;

import BiblioTec.Domain.Bibliotecario;
import BiblioTec.Domain.Usuario;
import org.springframework.stereotype.Repository;

/**
 *
 * @author andre
 */
@Repository
public interface BibliotecarioRepository extends PessoaRepository<Bibliotecario> {

}
