package devlee.learn.springormstudy.Bangjang.part7.JoinTable.manytoone;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Parent {

    @Id
    @GeneratedValue
    @Column(name = "PARENT_ID")
    private Long id;
    private String name;

    @OneToMany(mappedBy = "parent")
    private List<Child> child = new ArrayList<Child>();
}
