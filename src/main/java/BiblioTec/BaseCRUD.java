package BiblioTec;

import java.util.List;
import java.util.Optional;

public interface BaseCRUD<T, ID> {

        T save(T entity);

        void delete(ID id);

        List<T> getAll();

        T getById(ID id);

        Optional<T> update(ID id, T entity);
        
}
