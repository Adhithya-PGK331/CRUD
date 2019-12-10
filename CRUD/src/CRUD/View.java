package CRUD;

import java.awt.Choice;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class View {


	public void viewData() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ConnectionManager con=new ConnectionManager();
		Main first=new Main();
		PreparedStatement st=(PreparedStatement) con.getConnection().prepareStatement("insert into login(ID,USER_NAME,PASSWORD) values(?,?,?)");
		ResultSet r=st.executeQuery("select * from login");//query to select the details of all students
		//bjects returned from the query by repeatedly calling Statement
		System.out.println("Details-->");
		while(r.next())//iterating the values of result
		{
			System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3)+"\n");
		}
		
		first.choice();
	}
}