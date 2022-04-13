package pl.hackathon.knowx.model;

import lombok.*;
import org.springframework.stereotype.Component;

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
@Component
public class Workspace extends BaseEntity{
    private String workspaceName;
    private String description;

    @OneToMany(targetEntity = PropertiesList.class, mappedBy = "workspace", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private Set<PropertiesList> properties;

    @OneToMany(targetEntity = Flashcard.class, mappedBy = "workspace", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<Flashcard> flashcardsList = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private User workspaceOwner;

    @OneToMany(targetEntity = User.class, mappedBy = "participatedWorkspace", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<User> participants = new ArrayList<>();
}

