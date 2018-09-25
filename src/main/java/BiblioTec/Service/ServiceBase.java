package BiblioTec.Service;

import BiblioTec.BaseCRUD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Component
public abstract class ServiceBase<T, ID extends Serializable> implements BaseCRUD<T,ID> {

    protected final JpaRepository<T, ID> repository;

    public ServiceBase(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }
    @Override
    public T save(T entity) {
        System.out.println("chegou no save do Service");
        repository.save(entity);
        return null;
    }

    @Override
    public void delete(ID id) {

    }

    @Override
    public List<T> getAll() {
        return repository.findAll();
    }

    @Override
    public T getById(ID id) {
        return repository.findOne(id);
    }

    @Override
    public Optional<T> update(ID id, T entity) {
        return Optional.empty();
    }
}
