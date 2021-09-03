package devlee.learn.springormstudy.Bangjang.Chapter8.bangjang.cascade;

import javax.persistence.EntityManager;

public class Example {
    private static void saveNoCascade(EntityManager em) {
        Parent parent = new Parent();
        em.persist(parent);

        Child child1 = new Child();
        Child child2 = new Child();

        child1.setParent(parent);
        child2.setParent(parent);
        parent.getChildren().add(child1);
        parent.getChildren().add(child2);

        em.persist(parent);

        Parent findParent = em.find(Parent.class, 1L);
        Child findChild1 = em.find(Child.class, 1L);
        Child findChild2 = em.find(Child.class, 2L);

        em.remove(findChild1);
        em.remove(findChild2);
        em.remove(findParent);
    }
}
