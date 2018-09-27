package BiblioTec.Repository;

import BiblioTec.Domain.Pessoa;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public abstract interface PessoaRepository<P extends Pessoa> extends JpaRepository<P, Long> {
    P findByCpfContaining(String cpf);
    List<P> findByNomeContainingIgnoreCase(String nome);
    P findByRgContaining(String rg);
}
