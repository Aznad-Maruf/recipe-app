package net.therap.recipe.repository;

import net.therap.recipe.model.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author khandaker.maruf
 * @since 7/18/22
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
