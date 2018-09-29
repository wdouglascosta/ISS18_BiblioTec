package BiblioTec.API;

import BiblioTec.Domain.Usuario;
import BiblioTec.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path="api/livro", produces = MediaType.APPLICATION_JSON_VALUE)
public class LivroApi extends ItemApi<Livro, LivroService> {

    @Autowired
    public LivroApi(LivroService service) {
        super(service);
    }
}