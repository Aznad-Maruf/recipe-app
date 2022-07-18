package net.therap.recipe.controller;

import net.therap.recipe.model.Category;
import net.therap.recipe.repository.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author khandaker.maruf
 * @since 7/13/22
 */
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;

    public IndexController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {

        Category category = categoryRepository.findByDescriptionContainingIgnoreCase("meat").get();
        System.out.println(category.getDescription());
        return "index";
    }
}
