package net.therap.recipe.model;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author khandaker.maruf
 * @since 7/14/22
 */
@Entity
@Table(name = "note")
public class Note extends Persistence{

    @Lob
    private String note;
    @OneToOne(mappedBy = "note")
    private Recipe recipe;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
