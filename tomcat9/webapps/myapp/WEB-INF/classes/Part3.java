import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;

public class Part3 extends HttpServlet{
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
			//set file type
			response.setContentType("text/html");
			//create a writer to print HTML

			PrintWriter out = response.getWriter();

			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String confirmPassword = request.getParameter("confirmPassword");
			String picture = request.getParameter("picture");
			String gender = request.getParameter("gender");	
			String country = request.getParameter("country");
			String hobby = request.getParameter("hobby");
			String address = request.getParameter("address");
			out.println("<HTML>");
			out.println("<BODY>");
			out.println("<table border=1 align=center>");
			out.println("<tr></tr>");
			out.println("<th>parameter<th>value");
			out.println("<tr><td> email");
			out.println("	<td>" + email);
			out.println("<tr><td> password");
			out.println("	<td>" + password);
			out.println("<tr><td> confirmPassword");
			out.println("	<td>" +confirmPassword);
			out.println("<tr><td> picture");
			out.println("	<td>" +picture);
			out.println("<tr><td> gender");
			out.println("	<td>" +gender);
			out.println("<tr><td> country");
			out.println("	<td>" +country);
			out.println("<tr><td> hobby");
			out.println("	<td>" +hobby);
			out.println("<tr><td> address");
			out.println("	<td>" +address);
			out.println("</TABLE>");
			out.println("</BODY>");
			out.println("</HTML>");
			out.close();
		}
	
	
}