package devlee.learn.springormstudy.Bangjang.manytomany.basickey;

import devlee.learn.springormstudy.Bangjang.manytomany.connectentity.Member;
import devlee.learn.springormstudy.Bangjang.manytomany.connectentity.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Order {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    private int orderAmount;
}
