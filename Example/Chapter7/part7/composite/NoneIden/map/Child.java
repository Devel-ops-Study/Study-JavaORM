package devlee.learn.springormstudy.Bangjang.part7.composite.NoneIden.map;

import javax.persistence.*;

@Entity
public class Child {

    @Id
    @GeneratedValue
    @Column(name = "CHILD_ID")
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private Parent parent;
}
