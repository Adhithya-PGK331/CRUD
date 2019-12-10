package CRUD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {

	public void deleteData() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ConnectionManager con=new ConnectionManager();
		System.out.println("Enter the id to delete ");
		int id=s.nextInt();
		PreparedStatement st=con.getConnection().prepareStatement("delete from login where ID=?");
		
		
		st.setInt(1,id);
		st.executeUpdate();
		System.out.println("Deleted successfully..!!");
		
		Main first=new Main();
		first.choice();
	}

}
