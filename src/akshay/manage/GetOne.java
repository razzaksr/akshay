package akshay.manage;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
		String id=request.getParameter("number");
		String tech=request.getParameter("tech");
		String sdate=request.getParameter("start");
		String edate=request.getParameter("end");
		PreparedStatement ps=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay","root","");
			if(!id.equals("")&&tech.equals("")&&sdate.equals("")&&edate.equals(""))
			{
				int num=Integer.parseInt(request.getParameter("number"));
				String qry="select * from projects where pronum=?";
				ps=con.prepareStatement(qry);
				ps.setInt(1, num);
			}
			else if (id.equals("")&&tech.equals("")&&!sdate.equals("")&&!edate.equals(""))
			{
				String qry="select * from projects where prokickstart=? and prodeadline=?";
				ps=con.prepareStatement(qry);
				ps.setString(1, sdate);ps.setString(2, edate);
			}
			else if (id.equals("")&&!tech.equals("")&&sdate.equals("")&&edate.equals(""))
			{
				String qry="select * from projects where protech =?";
				ps=con.prepareStatement(qry);
				ps.setString(1, tech);
			}
			else if (id.equals("")&&tech.equals("")&&sdate.equals("")&&edate.equals(""))
			{
				String qry="select * from projects";
				ps=con.prepareStatement(qry);
			}
			ResultSet rs=ps.executeQuery();
			ArrayList<Projects> many=new ArrayList<Projects>();
			Projects pro=null;
			while(rs.next())
			{
				pro=new Projects();pro.setPronum(rs.getInt("pronum"));
				pro.setProname(rs.getString("proname"));pro.setProclient(rs.getString("proclient"));
				pro.setProreq((InputStream)rs.getBinaryStream("proreq"));
				pro.setProkickstart(rs.getDate("prokickstart"));
				pro.setProdeadline(rs.getDate("prodeadline"));pro.setProtech(rs.getString("protech"));
				pro.setProstatus(rs.getString("prostatus"));pro.setPromem(rs.getInt("promem"));
				many.add(pro);
			}
			RequestDispatcher rd=request.getRequestDispatcher("showOne.jsp");
			request.setAttribute("got", many);
			rd.forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
