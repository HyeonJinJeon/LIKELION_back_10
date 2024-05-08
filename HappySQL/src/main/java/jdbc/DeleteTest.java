package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTest {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3307/exam";
        String user = "jeon";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String sql = "delete from dept where deptno=50";
        try(Connection conn = DriverManager.getConnection(dbUrl,user,password);
            PreparedStatement ps = conn.prepareStatement(sql);
        ){
            int count = ps.executeUpdate();
            System.out.println(count+"건 삭제했습니다.");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
