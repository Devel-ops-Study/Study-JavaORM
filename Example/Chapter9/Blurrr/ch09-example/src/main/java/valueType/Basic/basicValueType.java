package valueType.Basic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class basicValueType {
    @Id @GeneratedValue
    private Long id;

    private String name;
    private int age;
}
