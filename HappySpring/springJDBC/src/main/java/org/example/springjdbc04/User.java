package org.example.springjdbc04;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class User {
    private Long id;
    private String name;
    private String email;
}
