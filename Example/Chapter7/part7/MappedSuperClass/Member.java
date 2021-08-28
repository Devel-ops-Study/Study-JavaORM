package devlee.learn.springormstudy.Bangjang.part7.MappedSuperClass;

import javax.persistence.Entity;

@Entity
public class Member extends BaseEntity {
    private String email;
}
