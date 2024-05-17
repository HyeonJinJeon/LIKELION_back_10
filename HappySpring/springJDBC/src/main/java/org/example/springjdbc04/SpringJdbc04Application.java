package org.example.springjdbc04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

@SpringBootApplication
public class SpringJdbc04Application {
    UserRowMapper userRowMapper;

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbc04Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(JdbcTemplate jdbcTemplate) {
        return args -> {
            // RowMapper example
            String sql = "SELECT id, name, email FROM users";
            List<User> users = jdbcTemplate.query(sql, new UserRowMapper());
            users.forEach(user -> System.out.println(user));
        };
    }
}
