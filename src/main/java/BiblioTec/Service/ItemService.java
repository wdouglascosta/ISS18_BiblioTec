package BiblioTec.Service;

import BiblioTec.Domain.Item;
import BiblioTec.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class ItemService<I extends Item, R extends ItemRepository<I>> extends ServiceBase<I, Long, R> {

    public ItemService(R repository) {
        super(repository);
    }

//    public List<I> findByNome(String nome) {
//        return repository.findByNomeContainingIgnoreCase(nome);
//    }
//
//    public List<I> findById(long id) {
//        return repository.findByIdContainingIgnoreCase(id);
//    }
//
//    public List<I> findByAutor(String autor) {
//        return repository.findByAutorContainingIgnoreCase(autor);
//    }
}
