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
 * Servlet implementation class PushNew
 */
@WebServlet("/propose")
public class PushNew extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PushNew() {
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
		String a=request.getParameter("app");
		String b=request.getParameter("client");
		String c=request.getParameter("doc");
		String d=request.getParameter("start");
		String e=request.getParameter("end");
		String f=request.getParameter("tech");
		int g=Integer.parseInt(request.getParameter("num"));
		InputStream is=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay","root","");
			String qry="Insert into projects(proname,proclient,proreq,prokickstart,prodeadline,protech,promem) values(?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(qry);ps.setString(1,a);
			ps.setString(2, b);ps.setString(4, d);ps.setString(5, e);
			ps.setString(6, f);ps.setInt(7, g);
			File file=new File(c);
			is=new FileInputStream(file.getAbsolutePath());
			ps.setBinaryStream(3, (InputStream)is);
			int res=ps.executeUpdate();
			RequestDispatcher rd=request.getRequestDispatcher("newSign.jsp");
			if(res!=0)
			{request.setAttribute("msg", "Project Approved");}
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
