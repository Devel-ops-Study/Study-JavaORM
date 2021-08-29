package model.Inheritance.SingleTableStrategy;


import model.Inheritance.JoinStrategy.JoinStrategyItem;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("B")
@PrimaryKeyJoinColumn(name = "BOOK_ID")
public class SingleTableStrategyBook extends JoinStrategyItem {
    private String author;
    private String isbn;
}