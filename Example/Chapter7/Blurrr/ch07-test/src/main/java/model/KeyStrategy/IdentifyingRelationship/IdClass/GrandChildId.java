package model.KeyStrategy.IdentifyingRelationship.IdClass;

import java.io.Serializable;

public class GrandChildId implements Serializable {

    private ChildId childId;
    private String Id;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
