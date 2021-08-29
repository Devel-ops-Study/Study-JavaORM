package model.Inheritance.JoinStrategy;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("B")
@PrimaryKeyJoinColumn(name = "BOOK_ID")
public class JoinStrategyBook extends JoinStrategyItem {
    private String author;
    private String isbn;
}