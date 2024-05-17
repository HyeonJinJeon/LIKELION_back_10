package org.example.springjdbc05;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootApplication
public class SpringJdbc05Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringJdbc05Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(JdbcTemplate jdbcTemplate){
        return args -> {
            String sql = "SELECT id, name, email FROM users";
            User user = jdbcTemplate.query(sql, new UserResultSetExtractor());
            System.out.println(user);
        };
    }

    private static class UserResultSetExtractor implements ResultSetExtractor<User>{
        //ResultSetExtractor 결과 집합 전체를 단일 객체로 변환 하는데 사용함..
        //여러 테이블에서 조인된 결과를 받아서 하나의 복합 객체로 매핑..
        @Override
        public User extractData(ResultSet rs) throws SQLException, DataAccessException {
            User user = new User();
            if(rs.next()){
                user.setId(rs.getLong("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));

                //지금 예제는 user 라나에 대한 값만 채우는거라 RowMapper와 크게 차이는 없어 보이지만...
                //게시글 이라면.. 게시글 하나에.. 댓글 리스트가 필드로 들어와 얻을 수 있다.
            }
            return user;
        }
    }
}
