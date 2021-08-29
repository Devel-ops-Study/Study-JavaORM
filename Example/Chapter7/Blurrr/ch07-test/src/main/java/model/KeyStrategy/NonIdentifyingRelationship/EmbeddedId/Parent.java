package model.KeyStrategy.NonIdentifyingRelationship.EmbeddedId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Parent {
    @EmbeddedId
    private ParentId Id;

    private String name;
}
