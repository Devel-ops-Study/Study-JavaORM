package devlee.learn.springormstudy.Bangjang.Chapter9.bangjang.embeddedtype.relation;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
@Getter @Setter
public class PhoneNumber {
    String areaCode;
    String localNumber;

    @ManyToOne
    PhoneServiceProvider provider;
}
