package CRUD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
	ConnectionManager con=new ConnectionManager();

	public void loginData() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the username");
		String name=s.next();
		System.out.println("Enter the password");
		String pass=s.next();
		int flag=1;
		Statement st=con.getConnection().createStatement();
		ResultSet set=st.executeQuery("select * from login"); 
		while(set.next()) {
			//to display the values
			String name1=set.getString(2);
			String pw1=set.getString(3);
		
		if(name1.contentEquals(name)&& pass.contentEquals(pw1)) 
			flag=1;
		}
		if(flag==1) {
			
			System.out.println("Details are correct");
		}
		else {
			System.out.println("Details are incorrect");
		}
		
		Main first=new Main();
		first.choice();
		
	}

}