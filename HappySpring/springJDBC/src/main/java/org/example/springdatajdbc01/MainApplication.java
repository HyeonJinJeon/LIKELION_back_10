package org.example.springdatajdbc01;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }

//    @Bean
//    CommandLineRunner demo(UserRepository userRepository){
//        return args -> {
////            userRepository.save(new User("신짱구", "qqqq11"));
////            userRepository.save(new User("김철수", "wwww22"));
////            userRepository.save(new User("이유리", "eeee33"));
////            userRepository.save(new User("박맹구", "tttt55"));
////            userRepository.save(new User("정훈이", "rrrr44"));
////            userRepository.save(new User("신형만", "aaaa22"));
////            userRepository.save(new User("봉미선", "ssss11"));
////            User user = userRepository.findById(7L).get();
////            System.out.println(user.getName());
////            List<User> userList = userRepository.findByName("전현진");
////            userList.forEach(u -> System.out.println(u.getId() + " " + u.getEmail()));
//            PageRequest pageRequest = PageRequest.of(0,3);
//            Page<User> allUser = userRepository.findAllUsersWithPagination(pageRequest);
//
//            allUser.forEach(user
//                    -> System.out.println("User found: " + user.getName() + ", Email: " + user.getEmail())
//            );
//        };
//    }

    @Bean
    public CommandLineRunner batchUpdateDamo(JdbcTemplate jdbcTemplate){
        return args -> {
            List<User> users = Arrays.asList(
                    new User(null, "Alice", "alice@example.com"),
                    new User(null, "Bob", "bob@example.com"),
                    new User(null, "Charlie", "charlie@example.com"),
                    new User(null, "David", "david@example.com")
            );

            String sql = "INSERT INTO users  (name, email) VALUES (?, ?)";

            // Execute batch update
            int[] updateCounts = jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
                public void setValues(PreparedStatement ps, int i) throws SQLException {
                    User user = users.get(i);
                    ps.setString(1, user.getName());
                    ps.setString(2, user.getEmail());
                }

                public int getBatchSize() {
                    return users.size();
                }
            });
            System.out.println("Batch update completed. Number of rows affected: " + Arrays.toString(updateCounts));
        };
    }
//    코드 설명
//    사용자 목록 생성: List<User>에 여러 사용자 정보를 저장합니다.
//    Batch Update SQL 준비: INSERT INTO 쿼리를 사용하여 사용자 정보를 데이터베이스에 삽입합니다.
//    BatchPreparedStatementSetter 사용: JdbcTemplate의 batchUpdate 메서드에 사용됩니다.
//    이 인터페이스는 각 배치 항목에 대한 PreparedStatement를 설정하는 데 사용됩니다.
//    Batch Size 반환: getBatchSize() 메서드를 통해 배치의 크기를 반환하며, 이는 전체사용자 목록의 크기와 같습니다.
//    결과 출력: 배치 업데이트 후에 각 업데이트의 결과를 배열로 출력합니다.
}
