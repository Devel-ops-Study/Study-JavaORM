package devlee.learn.springormstudy.Bangjang.Chapter8.bangjang.lazyloading.application;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter @Setter
public class Order {
    private String orderName;
}
