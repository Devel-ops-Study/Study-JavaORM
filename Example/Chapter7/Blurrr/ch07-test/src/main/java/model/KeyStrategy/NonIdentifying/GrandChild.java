package model.KeyStrategy.NonIdentifying;

import javax.persistence.*;

@Entity
public class GrandChild {

    @Id @GeneratedValue
    @Column(name = "GRNADCHILD_ID")
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "CHILD_ID")
    private Child child;
}
