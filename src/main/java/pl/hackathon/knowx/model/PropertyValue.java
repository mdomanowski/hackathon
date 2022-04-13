package pl.hackathon.knowx.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "property_value")
public class PropertyValue extends BaseEntity{
    private String name;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "properties_list_id")
    @JsonBackReference
    private PropertiesList propertiesList;
}
