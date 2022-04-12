package pl.hackathon.knowx.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BaseEntity{
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
}
