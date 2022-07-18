package net.therap.recipe.service;

import net.therap.recipe.model.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author khandaker.maruf
 * @since 7/18/22
 */
public class ServiceImpl<T> implements CrudService<T> {

    private final CrudRepository<T, Long> repository;

    public ServiceImpl(CrudRepository<T, Long> repository) {
        this.repository = repository;
    }

    @Override
    public List<T> findAll() {
        List<T> objects = new ArrayList<>();
        repository.findAll().forEach(objects::add);
        return objects;
    }

    @Override
    public T findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(T entity) {
        repository.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
