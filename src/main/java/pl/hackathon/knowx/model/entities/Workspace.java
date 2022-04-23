package pl.hackathon.knowx.model.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    @Builder.Default
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "workspace_id")
    private Set<PropertyKey> propertyKeys = new HashSet<>();

    @JsonProperty("flashcardss")
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "workspace_id")
    private List<Flashcard> flashcards = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private User workspaceOwner;

    @Builder.Default
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "workspace_id")
    private Set<User> observedWorkspace = new HashSet<>();

    @Builder.Default
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "workspace_id")
    private List<User> participants = new ArrayList<>();
}
