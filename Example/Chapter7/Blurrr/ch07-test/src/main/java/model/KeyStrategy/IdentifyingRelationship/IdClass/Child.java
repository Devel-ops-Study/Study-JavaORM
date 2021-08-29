package model.KeyStrategy.IdentifyingRelationship.IdClass;

import javax.persistence.*;

@Entity
@IdClass(ChildId.class)
public class Child {

    @Id
    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    public Parent parent;

    @Id
    @Column(name = "CHILD_ID")
    public ChildId childId;

    private String name;
}
