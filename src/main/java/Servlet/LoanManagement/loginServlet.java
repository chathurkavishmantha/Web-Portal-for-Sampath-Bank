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

import POJOClasses.pojoLogin;

/**
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
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
		
		String fName = request.getParameter("name");
		String email = request.getParameter("email");
		
		pojoLogin lg1 = new pojoLogin(fName,email);
		
		PrintWriter out = response.getWriter();
		
		try {
			if(lg1.validateLogin() ){
				if(!request.getParameter("name").isEmpty() && !request.getParameter("email").isEmpty()) {
					JOptionPane pane = new JOptionPane("Validated",JOptionPane.OK_OPTION);
					out.print("success");
					JDialog dialog = pane.createDialog("Status");  
					dialog.setAlwaysOnTop(true);  
					dialog.show(); 
					
					request.getRequestDispatcher("LM_LoanDeatailsMain.jsp").forward(request, response);
				}
				else {
					JOptionPane.showMessageDialog(null, "Login unsuccessful. Please Enter the Data ");
					
					request.getRequestDispatcher("LM_LoanSign.html").forward(request, response);
				}
				

			}
			else {
				
				JOptionPane pane = new JOptionPane("INValidated",JOptionPane.OK_OPTION);
				JDialog dialog = pane.createDialog("Status");  
				dialog.setAlwaysOnTop(true);  
				dialog.show(); 
				JOptionPane.showMessageDialog(null, "Login unsuccessful. Please Enter the Correct Data ");
				
				request.getRequestDispatcher("LM_LoanSign.html").forward(request, response);

			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}
