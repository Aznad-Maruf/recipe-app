package net.therap.recipe.service;

import java.util.List;

/**
 * @author khandaker.maruf
 * @since 7/18/22
 */
public interface CrudService<T> {

    List<T> findAll();

    T findById(Long id);

    T save(T entity);

    void delete(T entity);
    void deleteById(Long id);
}
