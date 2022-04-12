package pl.hackathon.knowx.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "tags")
public class Tag extends BaseEntity{
    private String name;

    @ManyToOne
    @JoinColumn(name = "flashcard_id")
    private Flashcard flashcard;
}
