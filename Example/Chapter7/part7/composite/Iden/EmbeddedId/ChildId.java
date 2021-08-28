package devlee.learn.springormstudy.Bangjang.part7.composite.Iden.EmbeddedId;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ChildId implements Serializable {
    private String parentId;

    @Column(name = "CHIDL_ID")
    private String id;
}
