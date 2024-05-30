package com.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SchoolExamMain {
    //select
    public static void select(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {
            School school = em.find(School.class , 1L);
            log.info(school.getName());
            log.info("--------------");
            for(Student stu : school.getStudents()){
                log.info(stu.getName());
            }

            Student student = em.find(Student.class,1L);
            log.info("student name : {}" , student.getName());
            log.info("student school: {}" , student.getSchool().getName());
            //em.getTransaction().commit();
        }finally {
            em.close();
        }
    }
    //create
    private static void create(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
            School school = new School("Lion school");

            Student student1 = new Student("전현진", school);
            Student student2 = new Student("신짱구", school);
            Student student3 = new Student("홍길동", school);

            school.getStudents().add(student1);
            school.getStudents().add(student2);
            school.getStudents().add(student3);

            em.persist(school);

            em.getTransaction().commit();

        }finally {
            em.close();
        }
    }
    public static void update(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
            School school = em.find(School.class, 3L);
            school.setName("update School Name");


            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    public static void delete(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {
            School school = em.find(School.class, 4L);
            em.remove(school);

            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }
    public static void main(String[] args) {
//        create();
//        update();
        delete();
    }
}