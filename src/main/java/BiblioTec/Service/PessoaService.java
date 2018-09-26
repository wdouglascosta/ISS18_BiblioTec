package BiblioTec.Service;

import BiblioTec.Domain.Pessoa;
import BiblioTec.Repository.PessoaRepository;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public abstract class PessoaService<P extends Pessoa, R extends PessoaRepository<P>> extends ServiceBase<P, Long, R> {

    public PessoaService(R repository) {
        super(repository);
    }

    public List<P> findByNome(String nome) {
        return repository.findByNomeContainingIgnoreCase(nome);
    }
}
