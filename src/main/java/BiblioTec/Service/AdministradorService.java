package BiblioTec.Service;

import BiblioTec.Domain.Administrador;
import BiblioTec.Repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author andre
 */
@Service
public class AdministradorService extends PessoaService<Administrador, AdministradorRepository> {

    @Autowired
    public AdministradorService(AdministradorRepository repository) {
        super(repository);
    }
}
