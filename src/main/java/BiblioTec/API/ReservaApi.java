package BiblioTec.API;

import BiblioTec.Domain.Reserva;
import BiblioTec.Service.ReservaService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="api/reserva", produces = MediaType.APPLICATION_JSON_VALUE)
public class ReservaApi extends ApiBase<Reserva, Long, ReservaService> {
    public ReservaApi(ReservaService service) {
        super(service);
    }





}
