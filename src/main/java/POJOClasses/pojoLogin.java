package POJOClasses;

import java.sql.SQLException;

import DAOClasses.DBLogin;

public class pojoLogin {
	String fname;
	String email;
	

	public pojoLogin(String fName, String email) {
		
		this.fname = fName;
		this.email = email;
		// TODO Auto-generated constructor stub
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean validateLogin() throws ClassNotFoundException, SQLException {
		
		return DBLogin.ValidateLogin(this);
	}

}
