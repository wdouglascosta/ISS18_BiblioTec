package BiblioTec.Service;

import BiblioTec.Domain.Academico;
import BiblioTec.Repository.AcademicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcademicoService extends ItemService<Academico, AcademicoRepository> {

    @Autowired
    public AcademicoService(AcademicoRepository repository) {
        super(repository);
    }

    public boolean hasData() {
        return repository.count() > 0;
    }
}