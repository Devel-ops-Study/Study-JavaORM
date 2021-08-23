package devlee.learn.springormstudy.Bangjang.manytoone.both;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    private String username;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    public void setTime(Team team) {
        if (!team.getMembers().contains(this))
            team.getMembers().add(this);
    }
}
