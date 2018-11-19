package BiblioTec.Repository;

import BiblioTec.Domain.Emprestimo;
import BiblioTec.Domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {

    List<Emprestimo> findByUsuario(Usuario usuario);
}
