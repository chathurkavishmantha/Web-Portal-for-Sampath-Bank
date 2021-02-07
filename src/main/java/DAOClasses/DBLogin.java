package DAOClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import POJOClasses.pojoLogin;

public class DBLogin {
	
	public static boolean ValidateLogin(pojoLogin lg1)throws ClassNotFoundException, SQLException  {
		
		
		Connection conn;
	
		String query1 = "SELECT * FROM register where fname=? AND email=?";
		
	
				conn = DBconnector.connectDB();
				PreparedStatement pst = conn.prepareStatement(query1); 
				
				pst.setString(1, lg1.getFname());
				pst.setString(2,lg1.getEmail());
				
				ResultSet rst = pst.executeQuery();
				
				if(rst.next()) {
					return true;
				}
				
				return false;

		
		
	
		}
}
