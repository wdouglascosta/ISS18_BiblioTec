package BiblioTec.Service;

import BiblioTec.Domain.Item;
import BiblioTec.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService<I extends Item, R extends ItemRepository<I>> extends ServiceBase<I, Long, R> {

    @Autowired
    public ItemService(R repository) {
        super(repository);
    }

    public boolean hasData(){
        return repository.count() > 0;
    }

    public List<I> findByNome(String nome) {
        return repository.findByNomeContainingIgnoreCase(nome);
    }
}
