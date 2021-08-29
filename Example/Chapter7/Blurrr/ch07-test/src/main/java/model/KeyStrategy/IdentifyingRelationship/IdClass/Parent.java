package model.KeyStrategy.IdentifyingRelationship.IdClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Parent {
    @Id
    @Column(name = "PARENT_ID")
    private Long Id;
    private String name;
}
