package org.example.jdbc03.dao;

import lombok.RequiredArgsConstructor;
import org.example.jdbc03.UserNotFoundException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;
@RequiredArgsConstructor // finaal이 붙은 것만 가지고 생성자를 만들어줘
@Repository
public class UserDaoImpl implements UserDao {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void insertUser(User user) {
        String sql = "INSERT INTO users(name, email) VALUES (?,?)";
        try{
            jdbcTemplate.update(sql, user.getName(), user.getEmail());
        }catch (DataAccessException e){
            throw new DataAccessException("추가할 수 없는 사용자입니다" + user.getName(), e) {};
        }
    }

    @Override
    public List<User> findAllUsers() {
        try{
            String sql = "SELECT id, name, email FROM users";
            RowMapper<User> rowMapper = (ResultSet rs, int rowNum) -> new User(
                    rs.getLong("id"),
                    rs.getString("name"),
                    rs.getString("email")
            );
            List<User> users = jdbcTemplate.query(sql, rowMapper);
            return users;
        }catch (DataAccessException e){
            throw new DataAccessException("user 정보들을 불러오지 못하였습니다" + e) {};
        }

    }

    @Override
    public void updateUserEmail(String name, String email) {
        String sql = "UPDATE users SET email = ? WHERE name = ?";
        int result = jdbcTemplate.update(sql, email, name);
        if(result == 0){
            throw new UserNotFoundException(name + "의 유저를 찾지 못하였습니다");
        }

    }

    @Override
    public void deleteUser(String name) {
        String sql = "DELETE FROM users WHERE name = ?";
        int result = jdbcTemplate.update(sql, name);
        if(result == 0){
            throw new UserNotFoundException(name + "의 유저를 찾지 못하였습니다");
        }
    }
}
