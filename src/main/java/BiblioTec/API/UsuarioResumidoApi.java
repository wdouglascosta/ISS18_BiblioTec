package BiblioTec.API;

import BiblioTec.DTO.ServiceDTO;
import BiblioTec.DTO.UsuarioResumido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path="/usuarioresumo", produces = MediaType.APPLICATION_JSON_VALUE)
public class UsuarioResumidoApi  {

@Autowired
private ServiceDTO serviceDTO;

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public UsuarioResumido getUsuarioResumido(@PathVariable("id") long id) {
        return serviceDTO.getUsuarioResumo(id);

    }

}
