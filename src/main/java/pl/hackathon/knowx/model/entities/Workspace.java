package pl.hackathon.knowx.model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
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

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "workspace_id")
    private Set<PropertyKey> propertyKeys = new HashSet<>();

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "workspace_id")
    private List<Flashcard> flashcards = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private User workspaceOwner;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "workspace_id")
    private List<User> participants = new ArrayList<>();
//    private List<String> participants = new ArrayList<>();
}
