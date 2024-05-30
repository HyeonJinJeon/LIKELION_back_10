package com.example.jpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Setter @Getter
public class Vehicle3 {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String manufacturer;
}

@Entity
@Setter @Getter
class Car3 extends Vehicle3 {
    private int seatCount;

}

@Entity
@Setter @Getter
class Truck3 extends Vehicle3 {
    private double payloadCapacity;
}