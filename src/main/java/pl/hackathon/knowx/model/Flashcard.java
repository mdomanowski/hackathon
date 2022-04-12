package pl.hackathon.knowx.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "flashcards")
public class Flashcard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private String link;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User author;

    @OneToMany(targetEntity = PropertyNameValue.class, mappedBy = "flashcard", fetch = FetchType.LAZY)
    private Set<PropertyNameValue> flashcardProperties;
    // TODO
    private List<Flashcard> backlinks;

    @OneToMany(targetEntity = Tag.class, mappedBy = "flashcard", fetch = FetchType.EAGER)
    private Set<Tag> tags;

    @ManyToOne
    @JoinColumn(name = "workspace_id")
    private Workspace workspace;

    public Flashcard(String title,
                     String description,
                     String link,
                     User author,
                     Set<PropertyNameValue> flashcardProperties,
                     List<Flashcard> backlinks,
                     Set<Tag> tags) {
        this.title = title;
        this.description = description;
        this.link = link;
        this.author = author;
        this.flashcardProperties = flashcardProperties;
        this.backlinks = backlinks;
        this.tags = tags;
    }
}
