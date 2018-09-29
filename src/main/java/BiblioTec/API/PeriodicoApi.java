package BiblioTec.API;

import BiblioTec.Domain.Usuario;
import BiblioTec.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path="api/periodico", produces = MediaType.APPLICATION_JSON_VALUE)
public class PeriodicoApi extends ItemApi<Periodico, PeriodicoService> {

    @Autowired
    public PeriodicoApi(PeriodicoService service) {
        super(service);

    }

}