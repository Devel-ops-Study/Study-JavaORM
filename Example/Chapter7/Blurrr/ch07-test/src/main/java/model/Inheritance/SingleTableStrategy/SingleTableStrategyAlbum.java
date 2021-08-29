package model.Inheritance.SingleTableStrategy;


import model.Inheritance.JoinStrategy.JoinStrategyItem;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class SingleTableStrategyAlbum extends JoinStrategyItem {
    private String artist;
}