package devlee.learn.springormstudy.Bangjang.Chapter8.bangjang.orphan;

import devlee.learn.springormstudy.Bangjang.Chapter8.bangjang.cascade.Parent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Child {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Parent parent;
}
