package devlee.learn.springormstudy.Bangjang.part7.MappedSuperClass;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public abstract class BaseEntity {

    @Id @GeneratedValue
    private Long id;

    private String name;
}
