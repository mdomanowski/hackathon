package pl.hackathon.knowx.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "flashcard_properties")
public class PropertyNameValue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String value;

    public PropertyNameValue(String name, String value) {
        this.name = name;
        this.value = value;
    }
    @ManyToOne
    @JoinColumn(name = "flashcard_id")
    private Flashcard flashcard;
}
