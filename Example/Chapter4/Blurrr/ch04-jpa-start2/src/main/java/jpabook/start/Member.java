package jpabook.start;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

    @NoArgsConstructor
    @Getter
    @Setter
    @Entity
    @Table(name="MEMBER", uniqueConstraints = {@UniqueConstraint(
            name = "NAME_AGE_UNIQUE",
            columnNames = {"NAME", "AGE"})})
    public class Member {
        @Id
        @Column(name = "ID")
        private String id;
        @Column(name = "NAME", nullable = false, length = 10)
        private String username;
        //자동 매핑 @Column(name = "AGE") 대소문자 구문 없는 데이터베이스 기준
        private Integer age;

        @Enumerated(EnumType.STRING)
        private RoleType roleType;
        @Temporal(TemporalType.TIMESTAMP)
        private Date createdDate;
        @Temporal(TemporalType.TIMESTAMP)
        private Date lastModifiedDate;
        @Lob
        private String description;
    }