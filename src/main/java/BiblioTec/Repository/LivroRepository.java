package BiblioTec.Repository;

import BiblioTec.Domain.Enums.ItemOrigem;
import BiblioTec.Domain.Item;
import BiblioTec.Domain.Livro;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends ItemRepository<Livro> {


}