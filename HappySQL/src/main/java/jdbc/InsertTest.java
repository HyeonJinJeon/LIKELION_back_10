package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {
    public static void main(String[] args) {
        //1. 필요한 객체를 선언한다.
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            //3. 접속
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbUrl = "jdbc:mysql://localhost:3307/exam";
            String user = "jeon";
            String password = "1234";
            conn = DriverManager.getConnection(dbUrl,user,password);

            //4. 쿼리 작성
            String sql = "insert into dept(deptno, dname, loc) values (50, '개발부', '서울')";
            ps = conn.prepareStatement(sql);
            //5.실행
            int count = ps.executeUpdate();
            System.out.println(count);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //2. 닫아준다.
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
