package devlee.learn.springormstudy.Bangjang.Chapter8.bangjang.orphan;

import javax.persistence.EntityManager;

public class Example {
    void orphanExample(EntityManager em) {
        Long id = 1L;

        Parent parent1 = em.find(Parent.class, id);
        parent1.getChildren().remove(0);

        Long parentId = 2L;

        Child child = new Child();

        Parent parent = em.find(Parent.class, parentId);
        parent.getChildren().add(child);
        parent.getChildren().remove(child);
    }
}
