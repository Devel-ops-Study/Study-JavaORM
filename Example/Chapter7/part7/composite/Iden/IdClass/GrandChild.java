package devlee.learn.springormstudy.Bangjang.part7.composite.Iden.IdClass;

import javax.persistence.*;

@Entity
@IdClass(GrandChildId.class)
public class GrandChild {

    @Id
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PARENT_ID"),
            @JoinColumn(name = "CHILD_ID")
    })
    private Child child;

    @Id
    @Column(name = "GRANTCHILD_ID")
    private String id;

    private String name;
}
