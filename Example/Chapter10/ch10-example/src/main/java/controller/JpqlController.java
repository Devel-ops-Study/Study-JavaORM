package controller;

import lombok.Setter;
import model.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Setter
public class JpqlController {
    static EntityManagerFactory emf;
    static EntityManager em;

    public void useJPQL() {
        String jpql = "select m from Member as m where m.username = 'kim'";
        List<Member> resultList = em.createQuery(jpql, Member.class).getResultList();
    }

    public void useTypeQuery() {
        TypedQuery<Member> query = em.createQuery("SELECT m FROM Member m", Member.class);

        List<Member> resultList = query.getResultList();
        for(Member member : resultList) {
            System.out.println("member = " + member);
        }
    }

    public void useQuery() {
        Query query = em.createQuery("SELECT m.usename, m.age from Member m");
        List resultList = query.getResultList();

        for (Object o : resultList) {
            Object[] result = (Object[]) o;
            System.out.println("username = " + result[0]);
            System.out.println("age = " + result[1]);
        }
    }

    public void bindingParameter() {
        String usernameParam = "User1";

        TypedQuery<Member> query = em.createQuery("SELECT m FROM Member m where m.username = :username", Member.class);

        query.setParameter("username", usernameParam);
        List<Member> resultList = query.getResultList();

        //chaining
        List<Member> members = em.createQuery("SELECT m FROM Member m where m.usename = :username", Member.class)
                .setParameter("username", usernameParam)
                .getResultList();

        //position base
        List<Member> members1 = em.createQuery("SELECT m FROM Member m where m.username = ?1", Member.class)
                .setParameter(1, usernameParam)
                .getResultList();
    }

    public void bindingPositionParameter() {

    }

    public void bulkTest() {
        String qlString = "update Product p " +
                        "set p.price = p.price * 1.1 " +
                        "where p.stockAmount < :stockAmount";

        int resultCount = em.createQuery(qlString)
                .setParameter("stockAmount", 10)
                .executeUpdate();
    }
}
