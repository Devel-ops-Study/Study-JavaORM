package devlee.learn.springormstudy.Bangjang.Chapter9.bangjang.embeddedtype.attributeoverride;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter @Setter
public class Address {
    private String city;
    private String street;
    private String zipcode;
}
