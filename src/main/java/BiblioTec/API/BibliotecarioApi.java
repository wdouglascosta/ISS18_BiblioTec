/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BiblioTec.API;

import BiblioTec.Domain.Bibliotecario;
import BiblioTec.Service.BibliotecarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author andre
 */
@RestController
@RequestMapping(path="api/bibliotecario", produces = MediaType.APPLICATION_JSON_VALUE)
public class BibliotecarioApi extends PessoaApi<Bibliotecario, BibliotecarioService> {

    @Autowired
    public BibliotecarioApi(BibliotecarioService service) {
        super(service);
    }
    

}
