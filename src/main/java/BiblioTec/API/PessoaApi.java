package BiblioTec.API;

import BiblioTec.Domain.Pessoa;
import BiblioTec.Service.ServiceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/person", produces = MediaType.APPLICATION_JSON_VALUE)
public class PessoaApi extends ApiBase<Pessoa, Long> {

    @Autowired
    public PessoaApi(ServiceBase<Pessoa, Long> service) {
        super(service);
    }
    
}
