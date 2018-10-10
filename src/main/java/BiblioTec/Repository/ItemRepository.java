package BiblioTec.Repository;

import BiblioTec.Domain.Enums.ItemOrigem;
import BiblioTec.Domain.Enums.ItemStatus;
import BiblioTec.Domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract interface ItemRepository<I extends Item> extends JpaRepository<I, Long> {

    List<Item> findByNomeContainingIgnoreCaseAndAndAtivoIsTrue(String nome);


    List<Item> findByAnoPublicacaoGreaterThanEqualAndAndAtivoIsTrue(int ano);
    List<Item> findByAutorContainingIgnoreCaseAndAtivoIsTrue(String autor);
    List<Item> findByEditoraContainingIgnoreCaseAndAtivoIsTrue(String editora);
    List<Item> findByOrigemAndAtivoIsTrue(ItemOrigem Origem);
    List<Item> findByStatusAndAndAtivoIsTrue(ItemStatus status);
    Item findById(long id);





}
