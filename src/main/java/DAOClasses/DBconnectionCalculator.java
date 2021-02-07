package DAOClasses;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import POJOClasses.pojoCalculator;

public class DBconnectionCalculator {

	public DBconnectionCalculator() {
		// TODO Auto-generated constructor stub
	}
	
	public static pojoCalculator insertValue(pojoCalculator c1) {
		Connection connection;
		
		String url = "jdbc:mysql://localhost:3306/customer";
		String user = "root";
		String pass = "";
		String query1 = "insert into calculator(loantype,loanamount,loanduration,loanrate) values (?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("driver");
			
			connection = DriverManager.getConnection(url, user, pass);
			System.out.println("connected");
			PreparedStatement pst = connection.prepareStatement(query1);
			
			pst.setString(1, c1.getLoanType());
			pst.setDouble(2, c1.getLoanAmount());
			pst.setInt(3, c1.getLoanDuration());
			pst.setDouble(4, c1.getIntrestrate());
			pst.execute();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c1;
		}
	
	}


