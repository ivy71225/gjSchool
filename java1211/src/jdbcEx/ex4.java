package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String url="jdbc:mysql://localhost:3306/school";
       String user="root";
       String password="1234";
       String SQL="update student set name=?,chi=?,eng=? where id=?";
       
       try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");			
			Connection conn=DriverManager.getConnection(url, user, password);//連線
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, "def");
			ps.setInt(2,70);
			ps.setInt(3,60);
			ps.setInt(4,5);
			
			ps.executeUpdate();
			
			
			
		
		} catch (SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("no driver");
			e.printStackTrace();
		}



	}

}