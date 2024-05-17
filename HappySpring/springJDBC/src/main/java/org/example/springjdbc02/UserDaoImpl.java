package org.example.springjdbc02;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class UserDaoImpl implements UserDao{
    private final JdbcTemplate jdbcTemplate;

    //아래의 메서드는 insert와 update가 한번에 일어나야되는 메서드이다.
    //트랜잭션 작업을 하기 때문에 만약 insert가 되었더라도 newEmail에 error가 있으면 insert작업이 취소가 된다
    @Override
    public void createAndUpdateUser(String name, String email, String newEmail) {
        jdbcTemplate.update("INSERT INTO users(name,email) VALUES (?,?)",name, email);
        if(newEmail.contains("error")){
            throw new RuntimeException("Simulated error");
        }
        jdbcTemplate.update("UPDATE users SET email = ? where name=?", newEmail,name);
    }
}