package devlee.learn.springormstudy.Bangjang.Chapter9.bangjang.embeddedtype.relation;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
@Getter @Setter
public class Address {
    String street;
    String city;
    String state;
    @Embedded Zipcode zipcode;
}
