package BiblioTec.Repository;

import BiblioTec.Domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract interface ItemRepository<I extends Item> extends JpaRepository<I, Long> {
    List<Item> findByNomeContaining(String nome);
    I findByAutorContaining(String autor);
    I findByIdContaining(long id);
    //List<I> findByNomeContainingIgnoreCase(String nome);


}
