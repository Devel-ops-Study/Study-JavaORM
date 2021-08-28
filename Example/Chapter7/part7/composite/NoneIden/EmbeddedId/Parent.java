package devlee.learn.springormstudy.Bangjang.part7.composite.NoneIden.EmbeddedId;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
@Data
public class Parent {

    @EmbeddedId
    private ParentId parentId;

    private String name;
}
