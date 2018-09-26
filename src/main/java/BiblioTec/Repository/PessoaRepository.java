package BiblioTec.Repository;

import BiblioTec.Domain.Pessoa;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public abstract interface PessoaRepository<P extends Pessoa> extends JpaRepository<P, Long> {
    List<P> findByNome(String nome);
}
