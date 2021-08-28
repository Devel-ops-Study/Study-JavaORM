package devlee.learn.springormstudy.Bangjang.part7.composite.Iden.EmbeddedId;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class GrandChildId implements Serializable {
    private ChildId childId;

    @Column(name = "GRANDCHILD_ID")
    private String id;
}
