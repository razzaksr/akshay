package akshay.manage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Change
 */
@WebServlet("/modify")
public class Change extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Change() {
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
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("pnum"));
		String a=request.getParameter("app");
		String b=request.getParameter("client");
		String c=request.getParameter("doc");
		String d=request.getParameter("start");
		String e=request.getParameter("end");
		String f=request.getParameter("tech");
		String h=request.getParameter("status");
		int g=Integer.parseInt(request.getParameter("num"));
		InputStream is=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay","root","");
			PreparedStatement ps=null;
			if(!c.isBlank()) 
			{
				String qry="update projects set pronum=?, proname=?,proclient=?,proreq=?,prokickstart=?,prodeadline=?,protech=?,promem=?,prostatus=? where pronum=?";
				ps=con.prepareStatement(qry);
				ps.setInt(1, id);ps.setString(2,a);
				ps.setString(3, b);ps.setString(5, d);ps.setString(6, e);
				ps.setString(7, f);ps.setInt(8, g);ps.setString(9, h);
				ps.setInt(10, id);
			File file=new File(c);
			is=new FileInputStream(file.getAbsolutePath());
			ps.setBinaryStream(4, (InputStream)is);
			}
			else
			{
				String qry="update projects set pronum=?, proname=?,proclient=?,prokickstart=?,prodeadline=?,protech=?,promem=?,prostatus=? where pronum=?";
				ps=con.prepareStatement(qry);
				ps.setInt(1, id);ps.setString(2,a);
				ps.setString(3, b);ps.setString(4, d);ps.setString(5, e);
				ps.setString(6, f);ps.setInt(7, g);ps.setString(8, h);
				ps.setInt(9, id);
			}
			int res=ps.executeUpdate();
			RequestDispatcher rd=request.getRequestDispatcher("readByOrder.jsp");
			if(res!=0)
			{request.setAttribute("msg", "Project Updated");}
			else {request.setAttribute("msg", "Project Not Approved");}
			rd.forward(request, response);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
