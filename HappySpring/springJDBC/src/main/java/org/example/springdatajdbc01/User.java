package org.example.springdatajdbc01;
//엔티티 클래스 (DTO는 단순히 값만 담아서 전달되는 객체라면...) 엔티티는 데이터베이스와의 관계를 알려주는 열할도 해준다.

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private Long id;
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
