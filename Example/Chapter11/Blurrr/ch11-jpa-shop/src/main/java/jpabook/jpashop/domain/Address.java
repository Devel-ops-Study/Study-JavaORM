package jpabook.jpashop.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Setter @Getter
@AllArgsConstructor
public class Address {
    private String city;
    private String street;
    private String zipcode;
}
