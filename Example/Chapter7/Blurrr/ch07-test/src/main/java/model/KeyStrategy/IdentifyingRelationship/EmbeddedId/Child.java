package model.KeyStrategy.IdentifyingRelationship.EmbeddedId;

import javax.persistence.*;

@Entity
public class Child {

    @EmbeddedId
    private ChildId childId;

    @MapsId("parentId")
    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private Parent parent;

    private String name;

}
