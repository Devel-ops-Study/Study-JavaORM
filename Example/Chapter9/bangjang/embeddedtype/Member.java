package devlee.learn.springormstudy.Bangjang.Chapter9.bangjang.embeddedtype;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Member {
    @Id @GeneratedValue
    private Long id;
    private String name;

    @Embedded
    Period workPeriod;

    @Embedded
    Address homeAddress;
}
