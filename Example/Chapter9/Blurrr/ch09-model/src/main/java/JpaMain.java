import model.Delivery;
import model.Order;
import model.OrderItem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    static EntityManagerFactory emf;
    static EntityManager em;

    public static void main(String[] args)
    {
        emf = Persistence.createEntityManagerFactory("jpabook-ch9");
        em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            // business logics
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }

    public void ch08Test_beforeCascade() {
        Delivery delivery = new Delivery();
        em.persist(delivery);

        OrderItem orderItem1 = new OrderItem();
        OrderItem orderItem2 = new OrderItem();
        em.persist(orderItem1);
        em.persist(orderItem2);

        Order order = new Order();
        order.setDelivery(delivery);
        order.addOrderItem(orderItem1);
        order.addOrderItem(orderItem2);

        em.persist(order);
    }

    public void ch08Test_afterCascade() {
        Delivery delivery = new Delivery();
        OrderItem orderItem1 = new OrderItem();
        OrderItem orderItem2 = new OrderItem();

        Order order = new Order();
        order.setDelivery(delivery);
        order.addOrderItem(orderItem1);
        order.addOrderItem(orderItem2);

        em.persist(order);  //deliver, orderItem 자동 영속성 전이
    }
}
