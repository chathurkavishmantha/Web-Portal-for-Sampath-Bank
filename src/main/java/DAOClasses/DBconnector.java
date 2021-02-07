package DAOClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnector {

	private static Connection connection;
	
	public static Connection connectDB() throws SQLException, ClassNotFoundException {
		
		String url="jdbc:mysql://localhost:3306/customer";
		String user="root";
		String pass="";
		
		
		if(connection== null || connection.isClosed()) {
		
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(url, user, pass);
			
			
			
		}
		return connection;
		
	}

}
