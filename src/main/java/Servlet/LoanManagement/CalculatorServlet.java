package Servlet.LoanManagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAOClasses.DBconnectionCalculator;
import POJOClasses.pojoCalculator;

/**
 * Servlet implementation class CalculatorServlet
 */
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		pojoCalculator c1 = new pojoCalculator(request.getParameter("LoanType"),Double.parseDouble(request.getParameter("LoanAmount")),Integer.parseInt(request.getParameter("LoanDuration")),Double.parseDouble(request.getParameter("Rate"))) ;
		DBconnectionCalculator.insertValue(c1);
		
		
		double monthly = pojoCalculator.calculationMonthly(Double.parseDouble(request.getParameter("LoanAmount")), Integer.parseInt(request.getParameter("LoanDuration")), Double.parseDouble(request.getParameter("Rate")));
		double yearly = pojoCalculator.calculationYearly(Double.parseDouble(request.getParameter("LoanAmount")), Integer.parseInt(request.getParameter("LoanDuration")), Double.parseDouble(request.getParameter("Rate")));


		
		HttpSession session = request.getSession();
	    
	    session.setAttribute("LoanType",(request.getParameter("LoanType")));
	    session.setAttribute("LoanAmount", Double.parseDouble(request.getParameter("LoanAmount")));
	    session.setAttribute("LoanDuration", Integer.parseInt(request.getParameter("LoanDuration")));
	    session.setAttribute("LoanRate", Double.parseDouble(request.getParameter("Rate")));
	    session.setAttribute("year",(((int)monthly * 100)/100.0) );
	    session.setAttribute("month",((((int)yearly * 100) /100.0)) );
//    out.println("Monthly PAyment ===>"+(((int)monthly * 100)/100.0));
//    out.println("Yerlty PAyment ===>"+ (((int)yearly * 100) /100.0));

    
    
    request.getRequestDispatcher("/LM_Loandetails.jsp").forward(request, response);
    
}

}
