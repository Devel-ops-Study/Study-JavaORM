package devlee.learn.springormstudy.Bangjang.Chapter9.bangjang.embeddedtype.relation;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class PhoneServiceProvider {
    @Id String name;
}
