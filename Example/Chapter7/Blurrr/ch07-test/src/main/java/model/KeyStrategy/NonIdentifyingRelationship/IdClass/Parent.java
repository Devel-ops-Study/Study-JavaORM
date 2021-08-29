package model.KeyStrategy.NonIdentifyingRelationship.IdClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(ParentId.class)
public class Parent {

    @Id
    @Column(name = "PARENT_ID1")
    private String Id1;

    @Id
    @Column(name = "PARENT_ID2")
    private String Id2;

    private String name;
}
