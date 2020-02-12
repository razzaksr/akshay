package akshay.manage;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Up
 */
@WebServlet("/Up")
public class Up extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Up() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("no")); 
		try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay","root","");
					String qry="select * from projects where pronum=?";
					PreparedStatement ps=con.prepareStatement(qry);
					ps.setInt(1, id);
					ResultSet rs=ps.executeQuery();
					if(rs.next())
					{
						RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
						request.setAttribute("one", rs.getInt("pronum"));
						request.setAttribute("two", rs.getString("proname"));
						request.setAttribute("three", rs.getString("proclient"));
						request.setAttribute("four",rs.getDate("prokickstart"));
						request.setAttribute("five", rs.getDate("prodeadline"));
						request.setAttribute("six", rs.getString("protech"));
						request.setAttribute("seven", rs.getString("prostatus"));
						request.setAttribute("eight", rs.getInt("promem"));
						rd.forward(request, response);
					}
					else
					{
						response.sendRedirect("readByOrder.jsp");
					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
