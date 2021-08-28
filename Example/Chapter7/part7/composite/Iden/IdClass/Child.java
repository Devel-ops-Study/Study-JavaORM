package devlee.learn.springormstudy.Bangjang.part7.composite.Iden.IdClass;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@IdClass(ChildId.class)
public class Child {

    @Id
    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private Parent parent;

    @Id
    @Column(name = "CHILD_ID")
    private String childId;

    private String name;
}
