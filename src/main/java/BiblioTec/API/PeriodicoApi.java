package BiblioTec.API;

import BiblioTec.Domain.Periodico;
import BiblioTec.Service.PeriodicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path="/periodico", produces = MediaType.APPLICATION_JSON_VALUE)
public class PeriodicoApi extends ItemApi<Periodico, PeriodicoService> {

    @Autowired
    public PeriodicoApi(PeriodicoService service) {
        super(service);

    }

}