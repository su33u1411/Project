import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public final class Search {

	public Search() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:8889/test","root@localhost", "");
			String q = "select * from members WHERE Name LIKE'Mo%'";
	    	Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(q);
			 while (rs.next())
			 {
				System.out.println(rs.getString("ID")+rs.getString("Name"));
			 }
			 System.out.println("Please Enter the Word");
			 String Search="Z";
			 String q1 = "SELECT * FROM members WHERE Name LIKE'$Search'";
		    	Statement stmt2=conn.createStatement();
				ResultSet rs1=stmt2.executeQuery(q1);
				 while (rs1.next())
				 {
					System.out.println(rs1.getString("ID")+rs1.getString("Name"));
				 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
