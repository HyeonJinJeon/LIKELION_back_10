package org.example.jdbc03;


import org.example.jdbc03.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJDBC03Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringJDBC03Application.class,args);
    }
    @Bean
    public CommandLineRunner demo(UserDao userDao){
        return args -> {
            //insert test
//            userDao.insertUser(new User(null, "h_jinnny", "hyeon@naver.com"));
//            userDao.updateUserEmail("kim", "qwer1234@naver.com");
            userDao.deleteUser("h_jinnny");
            userDao.findAllUsers().forEach(System.out::println);

        };
    }
}
