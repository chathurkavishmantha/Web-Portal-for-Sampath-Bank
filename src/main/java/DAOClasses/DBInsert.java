package DAOClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import POJOClasses.pojoInsertValue;

public class DBInsert {

	static Connection conn;
	public static pojoInsertValue InsertData(pojoInsertValue t1) {
		
		
		
		String url = "jdbc:mysql://localhost:3306/customer";
		String user = "root";
		String pass = "";
		
		String query1 = "insert into addloan(loantype,loanrate) values (?,?)";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("driver");
			
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("connected");
			PreparedStatement pst = conn.prepareStatement(query1);
			
			//pst.setString(1,t1.getId());
			pst.setString(1,t1.getType());
			pst.setString(2,t1.getRate());
			
			pst.execute();
			
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
