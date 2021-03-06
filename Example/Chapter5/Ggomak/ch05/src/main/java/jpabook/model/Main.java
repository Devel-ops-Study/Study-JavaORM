package jpabook.model;

import jpabook.model.entity.Member;
import jpabook.model.entity.Team;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by 1001218 on 15. 4. 5..
 */
public class Main {

    public static void main(String[] args) {

        //엔티티 매니저 팩토리 생성
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
        EntityManager em = emf.createEntityManager(); //엔티티 매니저 생성
        EntityTransaction tx = em.getTransaction(); //트랜잭션 기능 획득

        EntityManager em2 = emf.createEntityManager();
        EntityTransaction tx2 = em2.getTransaction();

        try {

            tx.begin(); //트랜잭션 시작
            testSaveNonOwner(em);
            tx.commit();//트랜잭션 커밋

//            tx2.begin();
//            biDirection(em2);
//            tx2.commit();


        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback(); //트랜잭션 롤백
        } finally {
            em.close(); //엔티티 매니저 종료
        }

        emf.close(); //엔티티 매니저 팩토리 종료
    }
    
    public static void testSave(EntityManager em) {
        Team team1 = new Team("team1", "팀1");
        em.persist(team1);

        Member member1 = new Member("member1", "회원1");
        member1.setTeam(team1);
        em.persist(member1);
        
        Member member2 = new Member("member2", "회원2");
        member2.setTeam(team1);
        em.persist(member2);
        
    }
    
    
    public static void biDirection(EntityManager em) {
        
        Team team = em.find(Team.class, "team1");
        List<Member> members = team.getMembers();
        System.out.println("go:" + members);
        for(Member member: members) {
            System.out.println("username:" + member.getUsername());
        }
        
    }
    
    public static void testSaveNonOwner(EntityManager em) {
        Member member1 = new Member("member1", "회원1");
        em.persist(member1);

        Member member2 = new Member("member2", "회원2");
        em.persist(member2);
        
        Team team1 = new Team("team1", "팀1");
        team1.getMembers().add(member1);
        team1.getMembers().add(member2);
        
        em.persist(team1);
    }

}
