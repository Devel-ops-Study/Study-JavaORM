package devlee.learn.springormstudy.Bangjang.part7.composite.Iden.EmbeddedId;

import javax.persistence.*;

@Entity
public class GrandChild {

    @EmbeddedId
    private GrandChildId grandChildId;

    @MapsId("childId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PARENT_ID"),
            @JoinColumn(name = "CHILD_ID")
    })
    private Child child;

    private String name;
}
