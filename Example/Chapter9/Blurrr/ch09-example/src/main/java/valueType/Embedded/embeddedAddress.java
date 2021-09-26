package valueType.Embedded;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class embeddedAddress {
    @Column(name = "city")
    private String city;
    private String street;
    private String zipcode;
}
