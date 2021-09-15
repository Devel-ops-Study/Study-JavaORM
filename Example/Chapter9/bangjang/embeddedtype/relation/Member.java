package devlee.learn.springormstudy.Bangjang.Chapter9.bangjang.embeddedtype.relation;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Member {
    @Id @GeneratedValue
    private Long id;

    @Embedded Address address;
    @Embedded PhoneNumber phoneNumber;
}
