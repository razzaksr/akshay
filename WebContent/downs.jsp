<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Downloading</title>
</head>
<body>
<%int q=Integer.parseInt(request.getParameter("no")); 
try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay","root","");
			String qry="select proreq from projects where pronum=?";
			PreparedStatement ps=con.prepareStatement(qry);
			ps.setInt(1, q);
			ResultSet rs=ps.executeQuery();
			//RequestDispatcher rd=request.getRequestDispatcher("showOne.jsp");
			if(rs.next())
			{
				File file=new File("downloaded.doc");
				InputStream is=rs.getBinaryStream("proreq");
				byte[] temp=new byte[is.available()];
				is.read(temp);
				FileOutputStream fos=new FileOutputStream(file);
				fos.write(temp);
				fos.close();
				%>
				
				Downloaded @"<%=file.getAbsolutePath() %>
				
			<%}
			else
			{
				//request.setAttribute("msg", "Can't download");
			}
			//rd.forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}%>
</body>
</html>