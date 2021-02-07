package DAOClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import POJOClasses.TestClass;


public class DBconnection {
	
	public static TestClass insertValue(TestClass t1) {
		
		
		Connection conn;
		
		String url = "jdbc:mysql://localhost:3306/customer";
		String user = "root";
		String pass = "";
		String query1 = "insert into register(fname,lname,email,address) values (?,?,?,?)";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("driver");
			
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("connected");
			PreparedStatement pst = conn.prepareStatement(query1);
			
			pst.setString(1, t1.getFname());
			pst.setString(2, t1.getLname());
			pst.setString(3, t1.getEmail());
			pst.setString(4, t1.getAddress());
			pst.executeUpdate();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t1;
		
	}

}
