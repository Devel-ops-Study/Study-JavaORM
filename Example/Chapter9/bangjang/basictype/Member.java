package devlee.learn.springormstudy.Bangjang.Chapter9.bangjang.basictype;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private int age;
}
