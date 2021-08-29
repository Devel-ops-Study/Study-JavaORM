package model.Inheritance.JoinStrategy;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE")
public class JoinStrategyItem {
    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long Id;

    private String name;
    private int price;
}
