package BiblioTec.Service;

import BiblioTec.Domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemService extends ServiceBase<Item, Long> {

    @Autowired
    public ItemService(JpaRepository<Item, Long> repository) {
        super(repository);
    }
}
