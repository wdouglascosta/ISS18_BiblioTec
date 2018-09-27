package BiblioTec.Repository;

import BiblioTec.Domain.Autor;
import BiblioTec.Domain.Usuario;
import org.springframework.stereotype.Repository;

/**
 *
 * @author andre
 */
@Repository
public interface AutorRepository extends PessoaRepository<Autor> {

}
