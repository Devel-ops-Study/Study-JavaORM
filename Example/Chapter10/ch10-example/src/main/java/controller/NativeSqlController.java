package controller;

import lombok.Setter;
import model.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Setter
public class NativeSqlController {
    static EntityManagerFactory emf;
    static EntityManager em;

    public void useNativeSQL() {
        String sql = "SELECT ID, AGE, TEAM_ID, NAME " +
                    "FROM MEMBER" +
                    "WHERE NAME = 'kim'";
        List<Member> resultList = em.createNativeQuery(sql, Member.class).getResultList();
    }
}
