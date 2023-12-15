package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String url="jdbc:mysql://localhost:3306/school";
       String user="root";
       String password="1234";
       String SQL="delete from student where id=?";
       
       
       try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");			
			Connection conn=DriverManager.getConnection(url, user, password);//連線
			PreparedStatement ps=conn.prepareStatement(SQL);
			
			ps.setInt(1, 3);
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