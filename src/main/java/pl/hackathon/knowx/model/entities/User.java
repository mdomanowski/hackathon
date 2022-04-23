package pl.hackathon.knowx.model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
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

//    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id")
//    private Set<Workspace> ownWorkspaces = new HashSet<>();
//
//    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id")
//    private Set<Workspace> observedWorkspace = new HashSet<>();
//
//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
//    private Workspace participatedWorkspace;
}
