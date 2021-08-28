package devlee.learn.springormstudy.Bangjang.part7.Single_Table_Strategy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")
public class Book extends Item {
}
