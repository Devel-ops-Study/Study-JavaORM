package controller;

import com.mysema.query.jpa.impl.JPAQuery;
import lombok.Setter;
import model.Member;
import model.QMember;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Setter
public class QueryDslController {
    static EntityManagerFactory emf;
    static EntityManager em;

    public void queryDSL() {
        JPAQuery query = new JPAQuery(em);
        QMember qMember = new QMember("m");
        List<Member> members =
                query.from(qMember)
                .where(qMember.username.eq("회원1"))
                .orderBy(qMember.username.desc())
                .list(qMember);
    }
}
