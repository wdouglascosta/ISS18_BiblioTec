package BiblioTec.API;

import BiblioTec.Domain.Item;
import BiblioTec.Domain.Livro;
import BiblioTec.Service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path="/livro", produces = MediaType.APPLICATION_JSON_VALUE)
public class LivroApi extends ItemApi<Livro, LivroService> {

    @Autowired
    public LivroApi(LivroService service) {
        super(service);
    }

}