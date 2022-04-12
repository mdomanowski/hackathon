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
    private Set<String> propertyValues;

    public PropertiesList(String name, Set<String> propertyValues) {
        this.name = name;
        this.propertyValues = propertyValues;
    }

    @ManyToOne
    @JoinColumn(name = "workspace_id")
    private Workspace workspace;
}
