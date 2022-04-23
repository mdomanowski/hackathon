package pl.hackathon.knowx.model.entities;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "property_values")
public class PropertyValue extends BaseEntity{
    private String name;
}

