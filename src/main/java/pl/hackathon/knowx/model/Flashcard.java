package pl.hackathon.knowx.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "flashcards")
public class Flashcard extends BaseEntity{
    private String title;
    private String description;
    private String link;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User author;

    @OneToMany(targetEntity = PropertyNameValue.class, mappedBy = "flashcard", fetch = FetchType.LAZY)
    private Set<PropertyNameValue> flashcardProperties;
    // TODO
    //private List<Flashcard> backlinks;

    @OneToMany(targetEntity = Tag.class, mappedBy = "flashcard", fetch = FetchType.EAGER)
    private Set<Tag> tags;

    @ManyToOne
    @JoinColumn(name = "workspace_id")
    private Workspace workspace;
}
