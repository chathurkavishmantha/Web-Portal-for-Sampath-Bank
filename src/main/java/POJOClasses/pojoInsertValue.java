package POJOClasses;

import java.sql.SQLException;

import DAOClasses.DBInsert;
import DAOClasses.DBLogin;

public class pojoInsertValue {

	String id;
	String type;
	String rate;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	
}


