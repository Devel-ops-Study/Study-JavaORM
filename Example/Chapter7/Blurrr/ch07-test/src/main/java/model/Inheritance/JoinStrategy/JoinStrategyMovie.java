package model.Inheritance.JoinStrategy;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("M")
public class JoinStrategyMovie extends JoinStrategyItem {
    private String director;
    private String actor;
}