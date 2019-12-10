package CRUD;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Main first=new Main();
		first.choice();
	}

	public void choice() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("1.Insert\n2.View\n3.Update\n4.Delete\n5.Login\n6.Exit");
		System.out.println("Enter your choice \n");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
			Insert in =new Insert();
			in.insertData();
			break;
		case 2:
			View vi =new View();
			vi.viewData();
			break;
		case 3:
			Update up =new Update();
			up.updateData();
			break;
		case 4:
			Delete del =new Delete();
			del.deleteData();
			break;
		case 5:
			Login log =new Login();
			log.loginData();
			break;
		case 6:
			System.out.println("Exitted successfully..!!");
			System.exit(0);
		}
	}


}
