package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class ex2 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/school";
	    String user="root";
		String password="1234";
		String SQL="insert into student(name,chi,eng) values(?,?,?)";
try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection(url,user,password);
		PreparedStatement ps=conn.prepareStatement(SQL);
		ps.setString(5,"teacher");
		ps.setInt(2,60);
		ps.setInt(3,80);
		
		ps.executeUpdate();
		
}catch(SQLException e) {
        System.out.println("no connection");
        e.printStackTrace();
}catch(ClassNotFoundException e) {
	System.out.println("no driver");
	e.printStackTrace();
}

	}

}
