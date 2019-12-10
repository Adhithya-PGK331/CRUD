package CRUD;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

	public void updateData() throws ClassNotFoundException, SQLException {
		ConnectionManager con=new ConnectionManager();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the id to update ");
		int id1=s.nextInt();
		System.out.println("Enter the new user id to update ");
		int id=s.nextInt();
		System.out.println("Enter new name ");
		String name=s.next();
		System.out.println("Enter new password ");
		String password=s.next();
		PreparedStatement st=con.getConnection().prepareStatement("update login set ID=?,USER_NAME=?,PASSWORD=? where ID=?");
		st.setInt(1,id);
		st.setString(2, name);
		st.setString(3, password);
		st.setInt(4,id1);
		st.executeUpdate();
		System.out.println("Updated successfully..!!");
		
		Main first=new Main();
		first.choice();
	}

}
