package com.example.jpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "authors")
@Getter@Setter
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "author" , cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    //cascade를 all로 설정하면 수정 삭제 다 같이 될 수 있음 / 고아객체도 같이 지우기 (부모가 사라지면 같이 삭제)
    private List<Book> books = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }
}
