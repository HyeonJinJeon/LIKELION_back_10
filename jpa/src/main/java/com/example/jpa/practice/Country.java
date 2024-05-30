package com.example.jpa.practice;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "countries")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Country {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private String countryId;

    @Column(name = "country_name")
    private String countryName;


    @ManyToOne
    @JoinColumn(name="region_id")
    private Region region;

//    public Country(String countryName, Region region) {
//        this.countryName = countryName;
//        this.region = region;
//    }
}
