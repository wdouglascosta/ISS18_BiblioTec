package BiblioTec.API;

import BiblioTec.Domain.Academico;
import BiblioTec.Service.AcademicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path="/academico", produces = MediaType.APPLICATION_JSON_VALUE)
public class AcademicoApi extends ItemApi<Academico, AcademicoService> {

    @Autowired
    public AcademicoApi(AcademicoService service) {
        super(service);

    }

}