package Project;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	
	public static Connection getCon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentresultmgmt", "root", "shravani");
			System.out.println(con);
			return con;
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR...............!");
		}
		return null;	
	}

}
