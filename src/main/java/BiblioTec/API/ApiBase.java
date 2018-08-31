package BiblioTec.API;

import BiblioTec.BaseCRUD;
import BiblioTec.Service.ServiceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class ApiBase<T,ID extends Serializable> implements BaseCRUD<T,ID> {

    ServiceBase<T, ID> service;

    @Autowired
    public ApiBase(ServiceBase<T, ID> service) {
        this.service = service;
    }

    @Override
    @RequestMapping(method = RequestMethod.POST)
    public T save(@RequestBody T entity) {
        System.out.println(entity.toString());
        service.save(entity);
        return entity;
    }

    @Override
    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void delete(@PathVariable ID id) {
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
        T entity = service.getById(id);
        return entity;
    }

    @Override
    @RequestMapping(method = RequestMethod.PUT, path = "/{id}")
    public Optional<T> update(@PathVariable ID id, @RequestBody T entity) {
        return service.update(id, entity);
    }




}
