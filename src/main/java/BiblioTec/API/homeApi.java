package BiblioTec.API;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/home", produces = MediaType.APPLICATION_JSON_VALUE)
public class homeApi {


    @RequestMapping(method = RequestMethod.GET)
    public String returnTeste(){
        return "<h1> olá! </h1>";
    }
}
