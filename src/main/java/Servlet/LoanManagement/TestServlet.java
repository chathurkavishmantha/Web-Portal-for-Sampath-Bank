package Servlet.LoanManagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import DAOClasses.DBconnection;
import POJOClasses.TestClass;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fName = request.getParameter("firstName");
		String lName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
		PrintWriter out = response.getWriter();
		System.out.print("d");
		
		
		TestClass t1 = new TestClass(fName,lName,email,address);
		
		DBconnection.insertValue(t1);
		out.println(t1.getFname()); 
		out.println(t1.getLname());
		out.println(t1.getEmail());
		out.println(t1.getAddress());
		
		if(!request.getParameter("firstName").isEmpty() && !request.getParameter("lastName").isEmpty() && !request.getParameter("email").isEmpty()  && !request.getParameter("address").isEmpty()) {
			//request.getRequestDispatcher("LM_LoanDeatailsMain.jsp").forward(request, response);
				JOptionPane pane = new JOptionPane("Validated",JOptionPane.OK_OPTION);
				out.print("success");
				JDialog dialog = pane.createDialog("Status");  
				dialog.setAlwaysOnTop(true);  
				dialog.show(); 
				
				request.getRequestDispatcher("LM_LoanSign.html").forward(request, response);
		}
		else{
			
				JOptionPane.showMessageDialog(null, "Login unsuccessful. Fiels Emplty.!!! Please Enter the Data ");
				
				request.getRequestDispatcher("LM_LoanRegister.html").forward(request, response);
		}
	}
		
		

	
}
