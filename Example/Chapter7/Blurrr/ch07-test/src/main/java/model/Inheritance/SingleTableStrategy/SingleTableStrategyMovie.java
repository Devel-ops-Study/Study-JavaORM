package model.Inheritance.SingleTableStrategy;


import model.Inheritance.JoinStrategy.JoinStrategyItem;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("M")
public class SingleTableStrategyMovie extends JoinStrategyItem {
    private String director;
    private String actor;
}