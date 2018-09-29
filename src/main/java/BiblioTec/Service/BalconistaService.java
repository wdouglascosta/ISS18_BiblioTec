package BiblioTec.Service;

import BiblioTec.Domain.Balconista;
import BiblioTec.Repository.BalconistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author andre
 */
@Service
public class BalconistaService extends PessoaService<Balconista, BalconistaRepository> {

    @Autowired
    public BalconistaService(BalconistaRepository repository) {
        super(repository);
    }
}
