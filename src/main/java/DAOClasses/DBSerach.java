package DAOClasses;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import POJOClasses.pojoInsertValue;
import POJOClasses.pojoSearch;

public class DBSerach {
	
	public static ArrayList<pojoInsertValue> Searchquery(pojoSearch search) throws ClassNotFoundException, SQLException {
		
		Connection conn;
		
		conn = DBconnector.connectDB();
		String se = search.getType();
		
		ArrayList al=null;
		
		ArrayList search_list =new ArrayList();
		
		String query = "select * from addloan where loanid like '%"+se+"%' or loantype like '%"+se+"%'";
		Statement st = (Statement) conn.createStatement();
		ResultSet  rs = st.executeQuery(query);
		
			while (rs.next()) {
			     al = new ArrayList();

		            al.add(rs.getString(1));
		            al.add(rs.getString(2));
		            al.add(rs.getString(3));

		            search_list.add(al);
            
				
			}
			

		return search_list;
		
		
	}

}
