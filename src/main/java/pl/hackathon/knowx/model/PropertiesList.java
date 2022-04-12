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
@Table(name = "properties")
public class PropertiesList extends BaseEntity{
    private String name;

    @OneToMany(targetEntity = PropertyValue.class, mappedBy = "propertiesList", fetch = FetchType.EAGER,
    cascade = CascadeType.PERSIST)
    private Set<PropertyValue> propertyValues;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "workspace_id")
    private Workspace workspace;
}
