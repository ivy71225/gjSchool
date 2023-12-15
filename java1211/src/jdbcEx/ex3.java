package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ex3 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/school";
		String user="root";
		String password="1234";
		String SQL="select * from student";		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");			
			Connection conn=DriverManager.getConnection(url, user, password);//連線
			PreparedStatement ps=conn.prepareStatement(SQL);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("id:"+rs.getInt("id")+
						"\t名:"+rs.getString("name")+
						"\t國文:"+rs.getInt("chi")+
						"\t英文:"+rs.getInt("eng"));
			                  } 
			
			
			/*rs.next();
			System.out.println("id:"+rs.getInt("id")+"\t名:"+rs.getString("name"));
			rs.next();
			System.out.println("id:"+rs.getInt("id")+"\t名:"+rs.getString("name"));*/
			
			
		} catch (SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("no driver");
			e.printStackTrace();
		}


	}

}