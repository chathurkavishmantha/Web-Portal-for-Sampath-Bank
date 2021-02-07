
package Servlet.LoanManagement;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import DAOClasses.DBInsert;
import DAOClasses.DBconnection;
import POJOClasses.TestClass;
import POJOClasses.pojoInsertValue;

/**
 * Servlet implementation class InsertLoanServlet
 */
public class InsertLoanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertLoanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

		String id = request.getParameter("LoanID");
		String type = request.getParameter("LoanType");
		String rate = request.getParameter("LoanRate"); 
		
		
		
		PrintWriter out = response.getWriter();
		System.out.print("d");
		
		
		pojoInsertValue t1 = new pojoInsertValue();
		t1.setId(id);
		t1.setRate(rate);
		t1.setType(type);
		
		//Changed
		
		DBInsert.InsertData(t1);
		
		if(!request.getParameter("LoanType").isEmpty() && !request.getParameter("LoanRate").isEmpty()) {
			//request.getRequestDispatcher("LM_LoanDeatailsMain.jsp").forward(request, response);
				JOptionPane pane = new JOptionPane("Validated",JOptionPane.OK_OPTION);
				out.print("success");
				JDialog dialog = pane.createDialog("Status");  
				dialog.setAlwaysOnTop(true);  
				dialog.show(); 
				
				request.getRequestDispatcher("LM_LoanDeatailsMain.jsp").forward(request, response);
		}
		else{
			
				JOptionPane.showMessageDialog(null, "Login unsuccessful. Fiels Emplty.!!! Please Enter the Data ");
				
				request.getRequestDispatcher("LM_LoanUpdate.jsp").forward(request, response);
		}
			

		
		
		
		
		
		
	}
	}

		


