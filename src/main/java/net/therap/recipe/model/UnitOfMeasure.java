package net.therap.recipe.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author khandaker.maruf
 * @since 7/14/22
 */
@Entity
@Table(name = "unit_of_measure")
public class UnitOfMeasure extends Persistence{

    private String name;

    @OneToOne(mappedBy = "unitOfMeasure")
    private Ingredient ingredient;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
