package BiblioTec.API;

import BiblioTec.Domain.Person;
import BiblioTec.Service.ServiceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/person", produces = MediaType.APPLICATION_JSON_VALUE)
public class PersonApi extends ApiBase<Person, Long> {

    @Autowired
    public PersonApi(ServiceBase<Person, Long> service) {
        super(service);
    }

}
