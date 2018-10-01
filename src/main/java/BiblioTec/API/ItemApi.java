package BiblioTec.API;

import BiblioTec.Domain.Enums.ItemOrigem;
import BiblioTec.Domain.Enums.ItemStatus;
import BiblioTec.Domain.Item;
import BiblioTec.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public abstract class ItemApi<I extends Item, S extends ItemService> extends ApiBase<I, Long, S> {

    public ItemApi(S service) {
        super(service);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/nome/{nome}")
    public List<I> getByName(@PathVariable("nome") String nome) {
        System.out.println("chegou aqui");
        List<I> entities = service.getByName(nome);
        return entities;
    }


//
    @RequestMapping(method = RequestMethod.GET, path = "/autor/{autor}")
    public List<Item> getByAutor(@PathVariable("autor") String autor) {
        return service.findByAutorContainingIgnoreCaseAndAtivoIsTrue(autor);
    }
//
    @RequestMapping(method = RequestMethod.GET, path = "/ano/{ano}")
    public List<Item> getByAno(@PathVariable("ano") int ano) {
        return service.findByAnoPublicacaoGreaterThanEqualAndAndAtivoIsTrue(ano);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/origem/{origem}")
    public List<Item> getByOrigem(@PathVariable("origem") ItemOrigem origem) {
        return service.findByOrigemAndAtivoIsTrue(origem);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/editora/{editora}")
    public List<Item> getByEditora(@PathVariable("editora") String editora) {
        return service.findByEditoraContainingIgnoreCaseAndAtivoIsTrue(editora);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/status/{status}")
    public List<Item> getByStatus(@PathVariable("status") ItemStatus status) {
        return service.findByStatusAndAndAtivoIsTrue(status);
    }


    /*
    @RequestMapping(method = RequestMethod.PUT, path = "/{id}/inativar")
    public void inativarPessoa(@PathVariable("id") Long id) {
        service.inativarPessoa(id);

    }
    */
}
