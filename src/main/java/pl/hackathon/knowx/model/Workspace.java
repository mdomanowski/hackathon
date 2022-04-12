package pl.hackathon.knowx.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "workspaces")
public class Workspace extends BaseEntity{
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
}

