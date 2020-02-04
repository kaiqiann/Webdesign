import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
public class Part7 extends HttpServlet{
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
			//set file type
			response.setContentType("text/html");
			//create a writer to print HTML
			PrintWriter out = response.getWriter();
			String child1= request.getParameter("child1");
			String child2= request.getParameter("child2");
			String child3= request.getParameter("child3");
			out.println("<HTML>");
			out.println("<BODY>");
			out.println("Your children's name are :<br>" );
			out.println(child1 +" <br><br>");
			out.println(child2 +" <br><br>");
			out.println(child3 +" <br><br>");
			out.println("<BODY>");
			out.println("<HTML>");
			out.close();
		}
	
	
}