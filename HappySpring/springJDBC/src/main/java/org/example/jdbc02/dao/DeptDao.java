package org.example.jdbc02.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class DeptDao {
    private final JdbcTemplate jdbcTemplate;
    public List<Dept> getDepts(){
        RowMapper<Dept> rowMapper = (ResultSet rs, int rowNum) -> {
            Dept dept = new Dept();
            dept.setDeptno(rs.getInt("deptno"));
            dept.setDname(rs.getString("dname"));
            dept.setLoc(rs.getString("loc"));
            return dept;
        };
        return jdbcTemplate.query("SELECT deptno, dname, loc From dept", rowMapper);
    }
}
