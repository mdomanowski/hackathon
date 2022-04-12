package pl.hackathon.knowx.model;

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

    @ManyToOne
    @JoinColumn(name = "properties_list_id")
    private PropertiesList propertiesList;
}
