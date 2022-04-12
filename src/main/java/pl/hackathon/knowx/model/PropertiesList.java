package pl.hackathon.knowx.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "properties")
@NoArgsConstructor
public class PropertiesList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private Set<String> properties;

    public PropertiesList(String name, Set<String> properties) {
        this.name = name;
        this.properties = properties;
    }
}
