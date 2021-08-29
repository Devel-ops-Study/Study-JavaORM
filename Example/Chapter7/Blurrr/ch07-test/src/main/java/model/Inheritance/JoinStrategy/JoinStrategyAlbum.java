package model.Inheritance.JoinStrategy;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class JoinStrategyAlbum extends JoinStrategyItem {
    private String artist;
}