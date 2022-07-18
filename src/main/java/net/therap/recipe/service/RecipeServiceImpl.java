package net.therap.recipe.service;

import net.therap.recipe.model.Recipe;
import net.therap.recipe.repository.RecipeRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author khandaker.maruf
 * @since 7/18/22
 */
@Service
public class RecipeServiceImpl extends ServiceImpl<Recipe> implements RecipeService{

    public RecipeServiceImpl(RecipeRepository repository) {
        super(repository);
    }
}
