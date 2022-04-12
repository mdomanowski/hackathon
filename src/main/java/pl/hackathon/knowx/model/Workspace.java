package pl.hackathon.knowx.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "workspaces")
@NoArgsConstructor
public class Workspace {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String workspaceName;
    private String description;
    private Set<PropertiesList> properties;
    private List<Flashcards> flashcardsList;

    private User workspaceOwner;
    private List<User> observers;

}
