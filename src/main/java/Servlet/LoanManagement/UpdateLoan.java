package Servlet.LoanManagement;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import DAOClasses.DBSerach;
import DAOClasses.DBUpdate;
import DAOClasses.DBUpdate2;
import POJOClasses.pojoInsertValue;
import POJOClasses.pojoSearch;
import POJOClasses.pojoUpdateLoan2;

/**
 * Servlet implementation class UpdateLoan
 */
public class UpdateLoan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateLoan() {
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
		
		String id = request.getParameter("loanID");
		String type = request.getParameter("loanType");
		String rate = request.getParameter("loanRate");	
		
		pojoUpdateLoan2 obj4 = new pojoUpdateLoan2(id, type, rate);
		
		pojoInsertValue obj = new pojoInsertValue();
		obj.setId(id);
		obj.setType(type);
		obj.setRate(rate);
	
		try {
		

			DBUpdate obj2 = new DBUpdate();
			obj2.updatefuntion(obj);
			
			
			
			
			//-------------------------------------
			//Re direct page , searched mode
			
			
			String dsearch = request.getParameter("dsearch");
			pojoSearch seach = new pojoSearch();
			seach.setType(dsearch);

			DBSerach p1 = new DBSerach();
			
			ArrayList search_list = p1.Searchquery(seach);

			request.setAttribute("result", search_list);
	        RequestDispatcher view = request.getRequestDispatcher("/LM_UpdateDetails.jsp");
	        view.forward(request, response);
	        
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
