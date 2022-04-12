package pl.hackathon.knowx.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
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

    @OneToMany(targetEntity = PropertiesList.class, mappedBy = "workspace", fetch = FetchType.EAGER)
    private Set<PropertiesList> properties;

    @OneToMany(targetEntity = Flashcard.class, mappedBy = "workspace", fetch = FetchType.EAGER)
    private List<Flashcard> flashcardsList = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User workspaceOwner;

    @OneToMany(targetEntity = User.class, mappedBy = "participatedWorkspace", fetch = FetchType.LAZY)
    private List<User> participants = new ArrayList<>();

    public Workspace(String workspaceName,
                     String description,
                     Set<PropertiesList> properties,
                     User workspaceOwner) {
        this.workspaceName = workspaceName;
        this.description = description;
        this.properties = properties;
        this.workspaceOwner = workspaceOwner;
    }
}

