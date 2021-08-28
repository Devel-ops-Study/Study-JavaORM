package devlee.learn.springormstudy.Bangjang.part7.composite.Iden.EmbeddedId;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Child {

    @EmbeddedId
    private ChildId id;

    @MapsId("parentId")
    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private Parent parent;

    private String name;
}
