package POJOClasses;

public class TestClass {
	
	String fname;
	String lname;
	String email;
	String address;
	
		
	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public TestClass(String fname, String lname, String email, String address){
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
}
