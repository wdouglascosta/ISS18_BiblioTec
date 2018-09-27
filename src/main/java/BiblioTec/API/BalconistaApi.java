package BiblioTec.API;

import BiblioTec.Domain.Balconista;
import BiblioTec.Service.BalconistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author andre
 */
@RestController
@RequestMapping(path="api/balconista", produces = MediaType.APPLICATION_JSON_VALUE)
public class BalconistaApi extends PessoaApi<Balconista, BalconistaService> {

    @Autowired
    public BalconistaApi(BalconistaService service) {
        super(service);
    }
    

}
