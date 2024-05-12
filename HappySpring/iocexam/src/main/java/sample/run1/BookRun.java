package sample.run1;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sample.bean.Book;
import sample.config.BookConfig;
import sample.config.MyBeanConfig;

public class BookRun {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BookConfig.class); // 공장이 생성될 때 어떤 빈을 생성해야 할지

        Book book1 = context.getBean(Book.class);
//        Book book2 = context.getBean("book2", Book.class);
//        Book book3 = context.getBean("book2", Book.class);

        book1.setTitle("모두의 자바");
        book1.setPrice(10000);

        System.out.println(book1);
//        System.out.println(book2);
//        System.out.println(book3);
//
//        if(book1 == book2) {
//            System.out.println("boo1 과 book2는 같은 인스턴스이다");
//        }else{
//            System.out.println("boo1 과 book2는 다른 인스턴스이다");
//        }
//
//        if(book2 == book3){
//            System.out.println("boo2 과 book3는 같은 인스턴스이다");
//        }else{
//            System.out.println("boo2 과 book3는 다른 인스턴스이다");
//        }
    }
}
