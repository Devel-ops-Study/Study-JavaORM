package devlee.learn.springormstudy.Bangjang.Chapter9.bangjang.embeddedtype.relation;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter @Setter
public class Zipcode {
    String zip;
    String plusFour;
}
