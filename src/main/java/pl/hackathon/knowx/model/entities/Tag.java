package pl.hackathon.knowx.model.entities;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "tags")
public class Tag extends BaseEntity{
    private String name;
}
