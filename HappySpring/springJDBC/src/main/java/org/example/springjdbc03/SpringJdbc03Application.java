package org.example.springjdbc03;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJdbc03Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringJdbc03Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserService userService){
        return args -> {
            try {
                userService.executeComplexBusinessProcess("john2", "error@exam.com");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        };
    }
}
