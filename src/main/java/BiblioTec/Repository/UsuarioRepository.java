package BiblioTec.Repository;

import BiblioTec.Domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author andre
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
