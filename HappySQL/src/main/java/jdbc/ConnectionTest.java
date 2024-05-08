package jdbc;
//1.라이브러리 추가!!
import java.sql.*;
public class ConnectionTest {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String dbUrl = "jdbc:mysql://localhost:3307/exam";
        String user = "jeon";
        String password = "1234";

        Connection conn = DriverManager.getConnection(dbUrl,user,password);

        if(conn != null){
            System.out.println("^^접속 성공");//연결된 경우
        }else{
            System.out.println("--;;");//연결되지 않은 경우
        }
        String dname = "개발부";
        //statement 를 사용할 때.
        String sql1 = "insert into dept(deptno, dname) values(3,'" + dname + "')";
        //DBMS는 쿼리가 들어오면 번역한다. 이 때 같은 쿼리가 들어오면 이미 번역한 것을 이용한다.
        //값이 바뀌면 다른 쿼리로 인식한다. 매번 번역한다.

        //PreparedStatement 를 사용할 때
        String sql2 = "insert into dept(deptno, dname) values(3, ?)";
        //여기까지를 번역.
        //값이 나중에 바뀌므로 매번 번역하지 않음. 문자열도 간결해지고, 성능도 좋으므로..
    }
}
