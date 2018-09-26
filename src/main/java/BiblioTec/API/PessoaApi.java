/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BiblioTec.API;

import BiblioTec.Domain.Pessoa;
import BiblioTec.Repository.PessoaRepository;
import BiblioTec.Service.PessoaService;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public abstract class PessoaApi<P extends Pessoa, S extends PessoaService> extends ApiBase<P, Long, S> {

    public PessoaApi(S service) {
        super(service);
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/nome/{nome}")
    public List<P> getByName(@PathVariable("nome") String nome) {
        List<P> entities = service.findByNome(nome);
        return entities;
    }
}
