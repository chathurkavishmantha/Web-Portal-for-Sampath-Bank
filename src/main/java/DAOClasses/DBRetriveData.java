package DAOClasses;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import POJOClasses.pojoInsertValue;
import POJOClasses.pojoSearch;

public class DBRetriveData {
	
public static ArrayList<pojoInsertValue> RetriveSearchquery() throws ClassNotFoundException, SQLException {
		
		Connection conn;
		
		conn = DBconnector.connectDB();
		
		ArrayList al=null;
		
		ArrayList search_list =new ArrayList();
		
		String query = "select * from addloan ";
		Statement st = (Statement) conn.createStatement();
		ResultSet  rs = st.executeQuery(query);
		
			while (rs.next()) {
			     pojoInsertValue p1 = new pojoInsertValue();

		            p1.setId(rs.getString(1));
		           p1.setType(rs.getString(2));
		            p1.setRate(rs.getString(3));

		            search_list.add(p1);
            
				//pojoInsertValue s1 = new pojoInsertValue(rs.getString(1),rs.getString(2),rs.getString(3));
				//search_list.add(s1);
				//System.out.println(rs.getString(1));
				//System.out.println(rs.getString(2));
				//System.out.println(rs.getString(3));
			}
			

		return search_list;
		
		
	}


}
