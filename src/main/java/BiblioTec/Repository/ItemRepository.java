package BiblioTec.Repository;

import BiblioTec.Domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository<I extends Item> extends JpaRepository<I, Long> {
    I findByNomeContaining(String nome);
    I findByAutorContaining(String autor);
    I findByEditoraContaining(String editora);
    //List<I> findByNomeContainingIgnoreCase(String nome);

}
