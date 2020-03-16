package akshay.basic;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logging
 */
@WebServlet("/sign")
@WebInitParam(name="hai",value="How you doing?")
public class Logging extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Logging() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//ServletConfig config;
		String us=request.getParameter("user");
		String ps=request.getParameter("pass");
		HttpSession ses=request.getSession();
		if(us.equalsIgnoreCase("akshay")&&ps.equalsIgnoreCase("aravind"))
		{
			RequestDispatcher dispatch=request.getRequestDispatcher("home.jsp");
			ses.setAttribute("who", us);
			Cookie cook1=new Cookie("akshay", "www.akshayproject.in");
			Cookie cook2=new Cookie("fb", "www.facebook.in");
			response.addCookie(cook1);response.addCookie(cook2);
			dispatch.forward(request, response);
		}
		else
		{
			RequestDispatcher dispatch=request.getRequestDispatcher("index.jsp");
			request.setAttribute("msg", "Login failed");
			dispatch.forward(request, response);
		}
	}

}
