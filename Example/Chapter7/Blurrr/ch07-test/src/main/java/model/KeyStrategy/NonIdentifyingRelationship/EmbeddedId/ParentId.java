package model.KeyStrategy.NonIdentifyingRelationship.EmbeddedId;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ParentId implements Serializable {
    @Column(name = "PARENT_ID1")
    private String Id1;
    @Column(name = "PARENT_ID2")
    private String Id2;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
