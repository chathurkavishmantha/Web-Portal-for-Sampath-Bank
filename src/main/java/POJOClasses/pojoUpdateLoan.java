package POJOClasses;

public class pojoUpdateLoan {

	
	double loanrate;
	String loantype;

	public pojoUpdateLoan(String type, double rate) {
		
		this.loantype = type;
		this.loanrate = rate;
	}


	public double getLoanrate() {
		return loanrate;
	}

	public void setLoanrate(double loanrate) {
		this.loanrate = loanrate;
	}

	public String getLoantype() {
		return loantype;
	}

	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	
	//public boolean validateUpdateSelect() throws ClassNotFoundException, SQLException {
		
	//	return DBUpdate.updatefunction(this);
	//}

}
