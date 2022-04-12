package pl.hackathon.knowx.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.jdbc.Work;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nickname;

    @OneToMany(targetEntity = Workspace.class, mappedBy = "workspaceOwner", fetch = FetchType.LAZY)
    private Set<Workspace> ownWorkspaces;

    /**
     * Jeden user może być tylko w jednym workspace,
     * TODO WIELE USEROW W WIELU WORKSPACE'ACH
     */
    @ManyToOne
    @JoinColumn(name = "workspace_id")
    private Workspace participatedWorkspace;

    public User(String nickname, Set<Workspace> ownWorkspaces, Workspace participatedWorkspace) {
        this.nickname = nickname;
        this.ownWorkspaces = ownWorkspaces;
        this.participatedWorkspace = participatedWorkspace;
    }
}
