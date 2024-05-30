package com.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersonExamMain {

    private static void find(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();

        try {
            Person person = em.find(Person.class, 3L);
            log.info("이름 : "+person.getName());
            log.info("여권 번호 : "+ person.getPassport().getPassportNumber());
            Passport passport = em.find(Passport.class, 3L);
            log.info("여권 번호 : "+passport.getPassportNumber());
            log.info("여권 주인 : "+ passport.getPerson().getName());
        }catch (Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
        }finally {
            em.close();
        }
    }
    private static void create(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();

        try {
            Person person = new Person("JeonHyeonJin");
            Passport passport = new Passport("J1234567");
            person.setPassport(passport);
            passport.setPerson(person);
            em.persist(person);
            em.getTransaction().commit();
        }catch (Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
        }finally {
            em.close();
        }
    }
    private static void update(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();

        try {
            Passport passport = em.find(Passport.class, 3L);
            passport.setPassportNumber("update123456");
            em.getTransaction().commit();
        }catch (Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
        }finally {
            em.close();
        }
    }
    private static void delete(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();

        try {
            // person이 삭제되면 passport도 같이 삭제된다 (Person 엔티티에 작성해놓은 cascade로 인해 같이 삭제됨)
            Person person = em.find(Person.class, 1L);
            em.remove(person);

            //그럼 passport가 삭제되면??    -- passport가 삭제된다고 person이 삭제되면 안된다.  즉, person이 갖고 있는 passport의 정보를 null로 만들어준다.
            Passport passport = em.find(Passport.class, 3L);
            passport.getPerson().setPassport(null);
            em.remove(passport);

            em.getTransaction().commit();
        }catch (Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
        }finally {
            em.close();
        }
    }
    public static void main(String[] args) {
//        create();
//        update();
        delete();
        find();
    }
}
