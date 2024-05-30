package com.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AuthorBookExamMain {
    //select
    public static void select(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {
            Author author = em.find(Author.class , 4L);
            log.info(author.getName());
            log.info("--------------");
            for(Book book : author.getBooks()){
                log.info(book.getTitle());
            }
            log.info("--------------");
            Book book = em.find(Book.class,4L);
            log.info("student name : {}" , book.getTitle());
            log.info("student school: {}" , book.getAuthor().getName());
        }finally {
            em.close();
        }
    }
    //create
    private static void create(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
            Author author = new Author("유명한");

            Book book1 = new Book("혼공자", author);
            Book book2 = new Book("알고리즘의 정석", author);
            Book book3 = new Book("데이터베이스 바로 알기", author);

            //작가 엔티티의 책 리스트에 넣어준다
            author.getBooks().add(book1);
            author.getBooks().add(book2);
            author.getBooks().add(book3);

            //author을 영속성 컨텍스트 함으로써 안에 있던 책의 리스트들도 같이 들고 넘어간다
            em.persist(author);

            em.getTransaction().commit();

        }finally {
            em.close();
        }
    }
    public static void update(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
            Author author = em.find(Author.class, 3L);
            author.setName("개명한 이름");

            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    public static void delete(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {
            Author author = em.find(Author.class, 3L);
            em.remove(author);

            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }
    public static void main(String[] args) {
        select();
//        create();
//        update();
//        delete();
    }
}