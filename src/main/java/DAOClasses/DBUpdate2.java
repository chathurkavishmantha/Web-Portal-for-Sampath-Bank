package DAOClasses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import POJOClasses.pojoUpdateLoan2;

public class DBUpdate2 {
	
public static pojoUpdateLoan2 updatefuntion2(pojoUpdateLoan2 obj4) throws ClassNotFoundException, SQLException {
		
		Connection conn;
		conn = DBconnector.connectDB();
		
	    String query1 = "update customer.addloan set loanid=?,loantype=?,loanrate=? where loanid=?";
	    PreparedStatement ps = (PreparedStatement) conn.prepareStatement(query1);
	    
	    
	    ps.setString(1, obj4.getId());
		ps.setString(2, obj4.getType());
		ps.setString(3, obj4.getRate());
		ps.setString(4, obj4.getId());
		 
		ps.executeUpdate();
		//ps.executeQuery();
		System.out.println("Successfuly Updated");
		conn.close();
		System.out.println("Disconnected from database");
		return obj4;
	}

}
