package net.therap.recipe.controller;

import net.therap.recipe.model.Recipe;
import net.therap.recipe.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author khandaker.maruf
 * @since 7/18/22
 */
@Controller
@RequestMapping("recipe")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "list", "/"})
    public String findAll(Model model) {
        model.addAttribute("recipes", recipeService.findAll());
        return "/recipe/list";
    }

    @RequestMapping({"/show/{id}"})
    public String findById(@PathVariable String id, Model model) {

        Recipe recipe = recipeService.findById(Long.valueOf(id));
        model.addAttribute("recipe", recipe);
        return "/recipe/show";
    }
}
