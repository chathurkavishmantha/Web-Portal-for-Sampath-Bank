package DAOClasses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import POJOClasses.pojoInsertValue;
import POJOClasses.pojoUpdateLoan;

public class DBUpdate {
	
	
	public static void updatefuntion(pojoInsertValue obj) throws ClassNotFoundException, SQLException {
		
		Connection conn;
		conn = DBconnector.connectDB();
		
	    String query1 = "update customer.addloan set loanid=?,loantype=?,loanrate=? where loanid=?";
	    PreparedStatement ps = (PreparedStatement) conn.prepareStatement(query1);
	    
	    
	    ps.setString(1, obj.getId());
		ps.setString(2, obj.getType());
		ps.setString(3, obj.getRate());
		ps.setString(4, obj.getId());
		 
		ps.executeUpdate();
		//ps.executeQuery();
		System.out.println("Successfuly Updated");
		conn.close();
		System.out.println("Disconnected from database");
	}

}
