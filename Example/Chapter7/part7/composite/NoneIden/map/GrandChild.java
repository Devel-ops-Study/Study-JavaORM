package devlee.learn.springormstudy.Bangjang.part7.composite.NoneIden.map;

import javax.persistence.*;

@Entity
public class GrandChild {

    @Id
    @GeneratedValue
    @Column(name = "GRANDCHILD_ID")
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "CHILD_ID")
    private Child child;
}
