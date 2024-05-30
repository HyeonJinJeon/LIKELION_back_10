package com.example.jpa.practice;

import com.example.jpa.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Id;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Main {
    private static void find(){

        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        Country country = em.find(Country.class, "+82");
        log.info("Country : {} {}", country.getRegion().getRegionName(), country.getCountryName());


        Region region1 = em.find(Region.class, 1);
        List<Country> countries1 = region1.getCountries();
        for(Country findCountry : countries1){
            log.info("Country : {} {}", findCountry.getRegion().getRegionName(), findCountry.getCountryName());
        }

        Region region2 = em.find(Region.class, 2);
        List<Country> countries2 = region2.getCountries();
        for(Country findCountry : countries2){
            log.info("Country : {} {}", findCountry.getRegion().getRegionName(), findCountry.getCountryName());
        }

    }

    private static void update(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();

        Region region = em.find(Region.class, 2);
        Country country = em.find(Country.class, "+82");
        country.setRegion(region);
    }
    public static void main(String[] args) {
//        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
//        em.getTransaction().begin();
//
//        Region region1 = new Region("아시아");
//        Country country1 = new Country("+82", "대한민국", region1);
//        Country country2 = new Country("+81", "일본", region1);
//        Country country3 = new Country("+86", "중국", region1);
//
//        em.persist(region1);
//        em.persist(country1);
//        em.persist(country2);
//        em.persist(country3);
//
//        Region region2 = new Region("유럽");
//        Country country4 = new Country("+44", "영국", region2);
//        Country country5 = new Country("+33", "프랑스", region2);
//        Country country6 = new Country("+34", "스페인", region2);
//
//        em.persist(region2);
//        em.persist(country4);
//        em.persist(country5);
//        em.persist(country6);
//        em.getTransaction().commit();

        find();
    }
}
