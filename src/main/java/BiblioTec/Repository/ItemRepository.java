package BiblioTec.Repository;

import BiblioTec.Domain.Enums.ItemOrigem;
import BiblioTec.Domain.Enums.ItemStatus;
import BiblioTec.Domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract interface ItemRepository<I extends Item> extends JpaRepository<I, Long> {

    List<Item> findByNomeContainingIgnoreCase(String nome);

    public List<Item> findByAnoPublicacaoGreaterThanEqualAndAndAtivoIsTrue(int ano);
    public List<Item> findByAutorContainingIgnoreCaseAndAtivoIsTrue(String autor);
    public List<Item> findByEditoraContainingIgnoreCaseAndAtivoIsTrue(String editora);
    public List<Item> findByOrigemAndAtivoIsTrue(ItemOrigem Origem);
    public List<Item> findByStatusAndAndAtivoIsTrue(ItemStatus status);
    public Item findById(long id);





}
