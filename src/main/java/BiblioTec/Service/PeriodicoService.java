package BiblioTec.Service;

import BiblioTec.Domain.Periodico;
import BiblioTec.Repository.PeriodicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeriodicoService extends ItemService<Periodico, PeriodicoRepository> {

    @Autowired
    public PeriodicoService(PeriodicoRepository repository) {
        super(repository);
    }

    public boolean hasData() {
        return repository.count() > 0;
    }
}