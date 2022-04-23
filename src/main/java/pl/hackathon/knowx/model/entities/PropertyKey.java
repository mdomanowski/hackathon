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
@Table(name = "property_keys")
public class PropertyKey extends BaseEntity{
    private String name;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "property_key_id")
    private Set<PropertyValue> propertyValues = new HashSet<>();
}
