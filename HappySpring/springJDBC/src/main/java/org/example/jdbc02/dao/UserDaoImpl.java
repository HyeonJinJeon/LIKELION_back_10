package org.example.jdbc02.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.util.List;
@RequiredArgsConstructor // finaal이 붙은 것만 가지고 생성자를 만들어줘
@Repository
public class UserDaoImpl implements UserDao{
    //필드 기반
//    @Autowired
    private final JdbcTemplate jdbcTemplate;

    //생성자 기반
//    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    //설정자 기반
//    @Autowired
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
//        this.jdbcTemplate = jdbcTemplate;
//    }

    @Override
    public void insertUser(User user) {
        String sql = "INSERT INTO users(name, email) VALUES (?,?)";
        jdbcTemplate.update(sql, user.getName(), user.getEmail());
    }

    @Override
    public List<User> findAllUsers() {
        String sql = "SELECT id, name, email FROM users";
        RowMapper<User> rowMapper = (ResultSet rs, int rowNum) -> new User(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("email")
        );
        List<User> users = jdbcTemplate.query(sql, rowMapper);
        return users;
    }

    @Override
    public void updateUserEmail(String name, String email) {
        String sql = "UPDATE users SET email = ? WHERE name = ?";
        jdbcTemplate.update(sql, email, name);
    }

    @Override
    public void deleteUser(String name) {
        String sql = "DELETE FROM users WHERE name = ?";
        jdbcTemplate.update(sql, name);
    }
}
