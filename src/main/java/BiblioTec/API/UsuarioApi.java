/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BiblioTec.API;

import BiblioTec.Domain.Usuario;
import BiblioTec.Service.ServiceBase;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 *
 * @author andre
 */
@RestController
@RequestMapping(path="api/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
public class UsuarioApi extends ApiBase<Usuario, Long>{
    
    @Autowired
    public UsuarioApi(ServiceBase<Usuario, Long> service) {
        super(service);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/xablau")

    public String nomedoMetodo(@RequestBody String param) {
        System.out.println("");

        return param;
    }


}
