package org.example.jdbc01;

import lombok.*;

//lombok!!  --
@AllArgsConstructor // 모든 요소의 생성자를 만들어준다
@Getter // getter를 만들어준다
@ToString
@NoArgsConstructor
@Setter
public class User {
    private Long id;
    private String name;
    private String email;
}
