package BiblioTec.Service;

import BiblioTec.Domain.Enums.ItemOrigem;
import BiblioTec.Domain.Enums.ItemStatus;
import BiblioTec.Domain.Item;
import BiblioTec.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class ItemService<I extends Item, R extends ItemRepository<I>> extends ServiceBase<I, Long, R> {

    public ItemService(R repository) {
        super(repository);
    }

    public List<I> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        I i = repository.findOne(id);
        i.setAtivo(false);
        save(i);
    }


    public List<I> getAllItens() {
        return repository.findAll();
    }

    public List<Item> getByName(String nome) {
        return repository.findByNomeContainingIgnoreCaseAndAndAtivoIsTrue(nome);
    }

    public List<Item> findByAnoPublicacaoGreaterThanEqualAndAndAtivoIsTrue(int ano){
        return repository.findByAnoPublicacaoGreaterThanEqualAndAndAtivoIsTrue(ano);
    }

    public List<Item> findByAutorContainingIgnoreCaseAndAtivoIsTrue(String autor){
        return repository.findByAutorContainingIgnoreCaseAndAtivoIsTrue(autor);
    }

    public List<Item> findByEditoraContainingIgnoreCaseAndAtivoIsTrue(String editora){
        return repository.findByEditoraContainingIgnoreCaseAndAtivoIsTrue(editora);
    }

    public List<Item> findByOrigemAndAtivoIsTrue(ItemOrigem origem){
        return repository.findByOrigemAndAtivoIsTrue(origem);
    }

    public List<Item> findByStatusAndAndAtivoIsTrue(ItemStatus status){
        return repository.findByStatusAndAndAtivoIsTrue(status);
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
