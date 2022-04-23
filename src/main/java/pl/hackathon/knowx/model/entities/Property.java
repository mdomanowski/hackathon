package pl.hackathon.knowx.model.entities;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "properties")
public class Property extends BaseEntity{
    private String key;
    private String value;
}

