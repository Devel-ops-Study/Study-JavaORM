package devlee.learn.springormstudy.Bangjang.Chapter9.bangjang.embeddedtype;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter @Setter
public class Address {
    @Column(name = "city")
    private String city;
    private String street;
    private String zipcode;
}
