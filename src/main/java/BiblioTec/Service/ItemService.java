package BiblioTec.Service;

import BiblioTec.Domain.Item;
import BiblioTec.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService extends ServiceBase<Item, Long, ItemRepository> {

    @Autowired
    public ItemService(ItemRepository repository) {
        super(repository);
    }

    public boolean hasData(){
        return repository.count() > 0;
    }


}
