package pl.hackathon.knowx.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "flashcard_properties")
public class PropertyNameValue extends BaseEntity{
    private String name;
    private String value;

    @ManyToOne
    @JoinColumn(name = "flashcard_id")
    private Flashcard flashcard;
}
