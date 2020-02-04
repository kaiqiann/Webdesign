import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;

public class Part4 extends HttpServlet{
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
			//set file type
			response.setContentType("text/html");
			//create a writer to print HTML
			PrintWriter out = response.getWriter();
			Enumeration<String> es = request.getParameterNames();
			
			out.println("<HTML>");
			out.println("<BODY>");
			out.println("<table border=1 align=center>");
			out.println("<tr></tr>");
			out.println("<th>parameter<th>value");
			while(es.hasMoreElements()){
				String hn = es.nextElement();
				out.println("<tr><td> "+hn);
				out.println("   <td>"+ request.getParameter(hn));
			}
			out.println("</TABLE>");
			out.println("</BODY>");
			out.println("</HTML>");
			out.close();
		}
	
	
}