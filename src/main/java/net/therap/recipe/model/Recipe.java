package net.therap.recipe.model;

import javax.persistence.*;

/**
 * @author khandaker.maruf
 * @since 7/14/22
 */
@Entity
@Table(name = "recipe")
public class Recipe extends Persistence{

    private String description;
    @Column(name = "prep_time")
    private int prepTime;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "note_id")
    private Note note;

    @Lob
    private Byte[] image;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }
}
