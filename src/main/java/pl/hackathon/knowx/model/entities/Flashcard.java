package pl.hackathon.knowx.model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
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

//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
//    private User author;
    private String author;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "flashcard_id")
    private Set<Property> properties = new HashSet<>();

//    TODO
//    private List<Flashcard> backlinks = new ArrayList<>();

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "flashcard_id")
    private Set<Tag> tags = new HashSet<>();
}
