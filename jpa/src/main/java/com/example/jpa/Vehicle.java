package com.example.jpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@Setter @Getter
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String manufacturer;
}

@Entity
@DiscriminatorValue("CAR")
@Setter @Getter
class Car extends Vehicle {
    private int seatCount;

}

@Entity
@DiscriminatorValue("TRUCK")
@Setter @Getter
class Truck extends Vehicle {
    private double payloadCapacity;
}