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

import DAOClasses.DBSerach;
import POJOClasses.pojoInsertValue;
import POJOClasses.pojoSearch;

/**
 * Servlet implementation class SearchServlet
 */
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
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
		
		String  type = request.getParameter("loanType");
		
		pojoSearch seach = new pojoSearch();
		seach.setType(type);
		
		DBSerach p1 = new DBSerach();
		
		try {
			ArrayList search_list = p1.Searchquery(seach);
			PrintWriter out = response.getWriter();
			//System.out.println(search_list);
		
//			search_list.get(3);
//			System.out.println(search_list.get(3));
//		HttpSession session = request.getSession();
//		session.setAttribute("val", search_list.get(3));
//		request.getRequestDispatcher("LoanHome.jsp").forward(request, response);
		
		request.setAttribute("result", search_list);
        RequestDispatcher view = request.getRequestDispatcher("/LM_UpdateDetails.jsp");
        view.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
