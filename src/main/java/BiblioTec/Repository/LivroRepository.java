package BiblioTec.Repository;

import BiblioTec.Domain.Livro;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends ItemRepository<Livro> {

}