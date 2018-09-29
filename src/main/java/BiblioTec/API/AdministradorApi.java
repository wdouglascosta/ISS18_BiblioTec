package BiblioTec.API;

import BiblioTec.Domain.Administrador;
import BiblioTec.Service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author andre
 */
@RestController
@RequestMapping(path="api/administrador", produces = MediaType.APPLICATION_JSON_VALUE)
public class AdministradorApi extends PessoaApi<Administrador, AdministradorService> {

    @Autowired
    public AdministradorApi(AdministradorService service) {
        super(service);
    }
    

}