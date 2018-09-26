/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BiblioTec.API;

import BiblioTec.Domain.Usuario;
import BiblioTec.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author andre
 */
@RestController
@RequestMapping(path="api/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
public class UsuarioApi extends PessoaApi<Usuario, UsuarioService> {

    @Autowired
    public UsuarioApi(UsuarioService service) {
        super(service);
            
    }

}
