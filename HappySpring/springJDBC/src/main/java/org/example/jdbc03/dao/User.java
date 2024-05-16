package org.example.jdbc03.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class User {
    private Long id;
    private String name;
    private String email;
}
