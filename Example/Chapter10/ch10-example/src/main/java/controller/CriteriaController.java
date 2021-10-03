package controller;

import javassist.compiler.MemberResolver;
import lombok.Setter;
import model.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Setter
public class CriteriaController {

    static EntityManagerFactory emf;
    static EntityManager em;

    public static void useCriteria() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Member> query = cb.createQuery(Member.class);

        Root<Member> m = query.from(Member.class);

        CriteriaQuery<Member> cq = query.select(m).where(cb.equal(m.get("username"), "kim"));
        List<Member> resultList = em.createQuery(cq).getResultList();
    }

    public void startCriteriaQuery() {
        //JPQL: select m from Member m

        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Member> cq = cb.createQuery(Member.class);

        Root<Member> m = cq.from(Member.class);
        cq.select(m);

        TypedQuery<Member> query = em.createQuery(cq);
        List<Member> members = query.getResultList();
    }

    public void searchCriteriaQuery() {
        // select m from Member m
        // where m.username='회원1'
        // order by m.age desc

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Member> cq = cb.createQuery(Member.class);
        Root<Member> m = cq.from(Member.class);

        Predicate usernameEqual = cb.equal(m.get("username"), "회원1");

        javax.persistence.criteria.Order ageDesc = cb.desc(m.get("age"));

        cq.select(m)
                .where(usernameEqual)
                .orderBy(ageDesc);

        List<Member> resultList = em.createQuery(cq).getResultList();
    }

}
