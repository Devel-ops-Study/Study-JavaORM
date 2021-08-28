package devlee.learn.springormstudy.Bangjang.part7.composite.Iden.IdClass;

import lombok.Data;

import java.io.Serializable;

@Data
public class GrandChildId implements Serializable {
    private ChildId childId;
    private String id;
}
