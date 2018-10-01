package BiblioTec.API;

import BiblioTec.BaseCRUD;
import BiblioTec.Domain.Model;
import BiblioTec.Service.ServiceBase;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

public abstract class ApiBase<T extends Model,ID extends Serializable,S extends ServiceBase> implements BaseCRUD<T,ID> {

    S service;

    @Autowired
    public ApiBase(S service) {
        this.service = service;
    }

    @Override
    @RequestMapping(method = RequestMethod.POST)
    public T save(@RequestBody T entity) {
        service.save(entity);
        return entity;
    }

    @Override
    @RequestMapping(method = RequestMethod.DELETE, path = "/permanent/{id}")
    public void deletePermanent(@PathVariable ID id) {
        service.deletePermanent(id);
    }

    @Override
    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void delete(@PathVariable ID id) {
        System.out.println("chegou no delete");
        service.delete(id);
    }

    @Override
    @RequestMapping(method = RequestMethod.GET)
    public List<T> getAll() {
        return service.getAll();
    }

    @Override
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public T getById(@PathVariable ID id) {
        T entity = (T) service.getById(id);
        return entity;
    }

    @Override
    @RequestMapping(method = RequestMethod.PUT, path = "/{id}")
    public Optional<T> update(@PathVariable ID id, @RequestBody T entity) {
        return service.update(id, entity);
    }




}
