package com.example.jpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "schools")
@Getter
@Setter
@NoArgsConstructor
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "school" , cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    //cascade를 all로 설정하면 수정 삭제 다 같이 될 수 있음 / 고아객체도 같이 지우기 (부모가 사라지면 같이 삭제)
    private List<Student> students = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }
}
