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
    @OneToMany
    private Set<PropertiesList> properties;
    @OneToMany
    private List<Flashcards> flashcardsList;
    private User workspaceOwner;
    @OneToMany
    private List<User> observers;

    public Workspace(String workspaceName, String description,
                     Set<PropertiesList> properties, List<Flashcards> flashcardsList,
                     User workspaceOwner, List<User> observers) {
        this.workspaceName = workspaceName;
        this.description = description;
        this.properties = properties;
        this.flashcardsList = flashcardsList;
        this.workspaceOwner = workspaceOwner;
        this.observers = observers;
    }
}
