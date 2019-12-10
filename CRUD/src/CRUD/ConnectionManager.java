package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {
	
public Connection getConnection() throws SQLException, ClassNotFoundException	{	// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=null;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
		if(con!=null)//Connection Checking
		{
			return con;
		}
		else {
			System.out.printf("Check your connection");
			return null;
		}
	}


}
