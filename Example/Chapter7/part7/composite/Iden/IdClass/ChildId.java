package devlee.learn.springormstudy.Bangjang.part7.composite.Iden.IdClass;

import lombok.Data;

import java.io.Serializable;

@Data
public class ChildId implements Serializable {
    private String parent;
    private String childId;
}
