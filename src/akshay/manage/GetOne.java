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
 * Servlet implementation class GetOne
 */
@WebServlet("/fetch")
public class GetOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(request.getParameter("number"));
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay","root","");
			String qry="select * from projects where pronum=?";
			PreparedStatement ps=con.prepareStatement(qry);
			ps.setInt(1, num);
			ResultSet rs=ps.executeQuery();
			Projects pro=null;
			if(rs.next())
			{
				pro=new Projects();pro.setPronum(rs.getInt("pronum"));
				pro.setProname(rs.getString("proname"));pro.setProclient(rs.getString("proclient"));
				pro.setProreq((InputStream)rs.getBinaryStream("proreq"));
				pro.setProkickstart(rs.getDate("prokickstart"));
				pro.setProdeadline(rs.getDate("prodeadline"));pro.setProtech(rs.getString("protech"));
				pro.setProstatus(rs.getString("prostatus"));pro.setPromem(rs.getInt("promem"));
				RequestDispatcher rd=request.getRequestDispatcher("showOne.jsp");
				request.setAttribute("got", pro);
				System.out.println(pro);
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("readByOrder");
				request.setAttribute("msg", "Invalid credentials to read");
				rd.forward(request, response);
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
