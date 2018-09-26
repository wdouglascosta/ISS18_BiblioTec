package BiblioTec.API;

import BiblioTec.Domain.Item;
import BiblioTec.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/Item", produces = MediaType.APPLICATION_JSON_VALUE)
public class ItemApi extends ApiBase<Item, Long, ItemService> {

    @Autowired
    public ItemApi(ItemService service) {
        super(service);
    }
}
