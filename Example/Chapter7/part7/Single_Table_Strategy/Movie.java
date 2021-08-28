package devlee.learn.springormstudy.Bangjang.part7.Single_Table_Strategy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("M")
public class Movie extends Item {
}
