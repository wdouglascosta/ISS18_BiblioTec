package BiblioTec.Service;

import BiblioTec.Domain.Balconista;
import BiblioTec.Repository.BalconistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcademicoService extends ItemService<Academico, AcademicoRepository> {

    @Autowired
    public AcademicoService(AcademicoRepository repository) {
        super(repository);
    }
}