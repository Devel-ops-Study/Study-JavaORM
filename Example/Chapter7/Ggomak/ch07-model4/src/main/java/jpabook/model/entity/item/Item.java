package jpabook.model.entity.item;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE")
public abstract class Item {
    
    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;
    
    
}
