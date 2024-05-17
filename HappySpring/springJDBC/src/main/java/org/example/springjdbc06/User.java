package org.example.springjdbc06;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
public class User {
    private Long id;
    private String name;
    private String email;
}
