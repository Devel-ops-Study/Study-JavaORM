package devlee.learn.springormstudy.Bangjang.Chapter8.bangjang.proxy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter @Setter
public class Member {
    private String username;

    @ManyToOne
    private Team team;
}
