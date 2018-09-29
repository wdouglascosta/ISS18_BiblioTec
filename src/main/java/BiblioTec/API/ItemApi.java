package BiblioTec.API;

import BiblioTec.Domain.Item;
import BiblioTec.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public abstract class ItemApi<I extends Item, S extends ItemService> extends ApiBase<I, Long, S> {

    public ItemApi(S service) {
        super(service);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/nome/{nome}")
    public List<I> getByName(@PathVariable("nome") String nome) {
        List<I> entities = service.findByNome(nome);
        return entities;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/autor/{autor}")
    public I getByAutor(@PathVariable("autor") String autor) {
        return (I) service.findByAutor(autor);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/id/{id}")
    public I getById(@PathVariable("id") long id) {
        return (I) service.findById(id);
    }

    /*
    @RequestMapping(method = RequestMethod.PUT, path = "/{id}/inativar")
    public void inativarPessoa(@PathVariable("id") Long id) {
        service.inativarPessoa(id);

    }
    */
}
