package pl.hackathon.knowx.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private Set<Workspace> ownWorkspaces;
    private Set<Workspace> observedWorkspaces;

    public User(String nickname, Set<Workspace> ownWorkspaces, Set<Workspace> observedWorkspaces) {
        this.nickname = nickname;
        this.ownWorkspaces = ownWorkspaces;
        this.observedWorkspaces = observedWorkspaces;
    }
}
