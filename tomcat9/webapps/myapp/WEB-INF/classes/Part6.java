import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
public class Part6 extends HttpServlet{
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
			//set file type
			response.setContentType("text/html");
			//create a writer to print HTML
			PrintWriter out = response.getWriter();
			
			HttpSession session = request.getSession();
			out.println("<HTML>");
			out.println("<BODY>");
			out.println("<h1>Session ID: " + session.getId() + "</h1>");
			out.println("<form method=\"POST\"  action:\"http://localhost:8080/myapp/myapp/part6\">");
			out.println("Please enter the name of child number 1: <br>" );
			out.println("<input type=\"text\" name=\"child1\" /><br>");
			out.println("Please enter the name of child number 2: <br>" );
			out.println("<input type=\"text\" name=\"child2\" /><br>");
			out.println("Please enter the name of child number 3: <br>" );
			out.println("<input type=\"text\" name=\"child3\" /><br>");
			out.println("<input type=\"submit\" value=\"submit\">");
			out.println("</form>");
			out.println("</BODY>");
			out.println("</HTML>");
			out.close();
		}
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
			//set file type
			response.setContentType("text/html");
			//create a writer to print HTML
			PrintWriter out = response.getWriter();
			String child1= request.getParameter("child1");
			String child2= request.getParameter("child2");
			String child3= request.getParameter("child3");
			HttpSession session = request.getSession();
			out.println("<HTML>");
			out.println("<BODY>");
			out.println("<h1>Session ID: " + session.getId() + "</h1>");

			out.println("Your children's name are : <br>" );
			out.println(child1 +" <br><br>");
			out.println(child2 +" <br><br>");
			out.println(child3 +" <br><br>");
			out.println("</BODY>");
			out.println("</HTML>");
			out.close();
		}
}