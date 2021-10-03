package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
@Entity(name = "Member")
public class Member {
    @Column(name = "name")
    private String username;
    @Column(name = "age")
    private int age;
}
