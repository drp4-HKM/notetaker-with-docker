package local.dplabs.notetaker.note;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.v3.oas.annotations.media.Schema;


@Entity
public class Note {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Schema(description = "The short note",
            name = "shortNote",
            required = true)
    private String shortNote;
    
    @Schema(description = "The detailed note",
            name = "detailedNote",
            required = false)
    private String detailedNote;

    
    public Note() {
    }


    public int getId() {
        return id;
    }


    public String getShortNote() {
        return shortNote;
    }


    public String getDetailedNote() {
        return detailedNote;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setShortNote(String shortNote) {
        this.shortNote = shortNote;
    }


    public void setDetailedNote(String detailedNote) {
        this.detailedNote = detailedNote;
    }    




}
