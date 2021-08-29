package model.Inheritance.SingleTableStrategy;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE")
public class SingleTableStrategyItem {
    @Id
    @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long Id;

    private String name;
    private int price;
}
