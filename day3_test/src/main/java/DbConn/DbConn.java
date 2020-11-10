package DbConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {

	public static void main(String[] args) {
		
		System.out.println(DbConn.get());

	}
	
	public static Connection get()
	{
		String url="jdbc:mysql://localhost:3306/school";
		String user="root";
		String password="1234";
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			 conn=DriverManager.getConnection(url, user, password);
			
			//return conn;
		} catch (ClassNotFoundException e) {
			System.out.println("no Driver");
			
			e.printStackTrace();
			
			//return conn;
		} catch (SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
			
			//return conn;
		}
		
		return conn;
	}
	
	
	

}