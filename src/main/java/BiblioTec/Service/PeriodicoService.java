package BiblioTec.Service;

import BiblioTec.Domain.Item;
import BiblioTec.Domain.Periodico;
import BiblioTec.Repository.PeriodicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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