package net.therap.recipe.repository;

import net.therap.recipe.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author khandaker.maruf
 * @since 7/14/22
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescriptionContainingIgnoreCase(String description);
}