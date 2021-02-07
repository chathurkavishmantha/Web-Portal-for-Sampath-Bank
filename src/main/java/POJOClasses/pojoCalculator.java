package POJOClasses;

public class pojoCalculator {
	String LoanType;
	double LoanAmount;
	int LoanDuration;
	double Intrestrate;
	
	public pojoCalculator(String LoanType,  double LoanAmount, int LoanDuration,  double Intrestrate) {
		
		this.LoanType = LoanType;
		this.LoanAmount = LoanAmount;
		this.LoanDuration = LoanDuration;
		this.Intrestrate = Intrestrate;
		
	}

	public String getLoanType() {
		return LoanType;
	}

	public void setLoanType(String loanType) {
		LoanType = loanType;
	}

	public double getLoanAmount() {
		return LoanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		LoanAmount = loanAmount;
	}

	public int getLoanDuration() {
		return LoanDuration;
	}

	public void setLoanDuration(int loanDuration) {
		LoanDuration = loanDuration;
	}

	public double getIntrestrate() {
		return Intrestrate;
	}

	public void setIntrestrate(double intrestrate) {
		Intrestrate = intrestrate;
	}
	
	
	public static double calculationMonthly (double loanAmount, int loanDuration, double intrestrate ) {
		
		
		      		       
		      double monthlyInterestRate = intrestrate/1200 ;
		   
		      double monthlyPayment =   loanAmount * monthlyInterestRate / 
		              (1- 1/ Math.pow(1+monthlyInterestRate, loanDuration * 12));
		       
		      return monthlyPayment;
		
	}
	
	public static double calculationYearly (double loanAmount, int loanDuration, double intrestrate ) {
		
		
	       
	      double monthlyInterestRate = intrestrate /1200;
	   
	      double monthlyPayment =   loanAmount * monthlyInterestRate / 
	              (1- 1/ Math.pow(1+monthlyInterestRate, loanDuration * 12));
	      
	      double totaltPayment = monthlyPayment * loanDuration *12;
	       
	      return totaltPayment;
	
	}
	
	
	
	
	

	

}
