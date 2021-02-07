package Servlet.LoanManagement;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAOClasses.DBDelete;
import DAOClasses.DBSerach;
import DAOClasses.DBUpdate;
import POJOClasses.pojoInsertValue;
import POJOClasses.pojoSearch;

/**
 * Servlet implementation class UpdateDeleteServlet
 */
public class UpdateDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDeleteServlet() {
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

		String value = request.getParameter("ud");
		
		if(value.equals("delete"))
		{
			String loanid = request.getParameter("loanid");
			String dsearch = request.getParameter("dsearch");
			
			DBDelete ds = new DBDelete();
			try {
				ds.deleteLoan(loanid);
				
				
				//-------------------------------------
				//Re direct page , searched mode

				pojoSearch seach = new pojoSearch();
				seach.setType(dsearch);

				DBSerach p1 = new DBSerach();
				
				ArrayList search_list = p1.Searchquery(seach);

				request.setAttribute("result", search_list);
		        RequestDispatcher view = request.getRequestDispatcher("/LM_UpdateDetails.jsp");
		        view.forward(request, response);
		        
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}
		else if(value.equals("update"))
		{
			String loanid = request.getParameter("loanid");
			String loanType = request.getParameter("loanType");
			String loanRate = request.getParameter("loanRate");
			
			ArrayList al= new ArrayList();
			
            al.add(loanid);
            al.add(loanType);
            al.add(loanRate);
            
            request.setAttribute("result", al);
	        RequestDispatcher view = request.getRequestDispatcher("/LM_LoanUpdateValue.jsp");
	        view.forward(request, response);
		}

	}

}
