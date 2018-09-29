package BiblioTec.Service;

import BiblioTec.Domain.Balconista;
import BiblioTec.Repository.BalconistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeriodicoService extends ItemService<Periodico, PeriodicoRepository> {

    @Autowired
    public PeriodicoService(PeriodicoRepository repository) {
        super(repository);
    }
}