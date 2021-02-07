package DAOClasses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBDelete {
	
	Connection conn ;
	
	public void deleteLoan(String del) throws ClassNotFoundException, SQLException {
		
		conn = DBconnector.connectDB();
		
		try {
		    String query1 = "delete from addloan where loanid = ?";
		    PreparedStatement ps = (PreparedStatement) conn.prepareStatement(query1);
			
		    ps.setString(1, del);
		    
			ps.executeUpdate();
			ResultSet rs = ps.executeQuery();
			System.out.println("Successfuly delete user");
			conn.close();
			System.out.println("Disconnected from database");

		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
