package BiblioTec.Repository;

import BiblioTec.Domain.Pessoa;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public abstract interface PessoaRepository<P extends Pessoa> extends JpaRepository<P, Long> {

    P findByCpfContaining(String cpf);

    P findByCpf(String cpf);

    boolean existsByCpf(String cpf);

    List<P> findByNomeContainingIgnoreCase(String nome);

    P findByRgContaining(String rg);
}
