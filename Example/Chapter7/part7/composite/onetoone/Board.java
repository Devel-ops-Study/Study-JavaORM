package devlee.learn.springormstudy.Bangjang.part7.composite.onetoone;

import javax.persistence.*;

@Entity
public class Board {

    @Id
    @GeneratedValue
    @Column(name = "BOARD_ID")
    private Long id;

    private String title;

    @OneToOne(mappedBy = "board")
    private BoardDetail boardDetail;
}
