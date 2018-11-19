package BiblioTec.API;

import BiblioTec.Domain.Emprestimo;
import BiblioTec.Service.EmprestimoService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/emprestimo", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmprestimoApi extends ApiBase<Emprestimo, Long, EmprestimoService> {


    public EmprestimoApi(EmprestimoService service) {
        super(service);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/test")
    public String test() {
        return "oi";
    }
}
