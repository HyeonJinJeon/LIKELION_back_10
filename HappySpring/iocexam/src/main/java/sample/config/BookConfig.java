package sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import sample.bean.Book;

@ComponentScan(basePackages = "sample.bean")
public class BookConfig {
//    @Bean
//    public Book book1() {
//        return new Book("hello", 10000);
//    }
//
//    @Bean
////    @Scope("prototype")
//    public Book book2() {
//        return new Book("spring", 24000);
//    }
}

