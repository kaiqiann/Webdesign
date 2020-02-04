import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;

public class Part5 extends HttpServlet{
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
			//set file type
			response.setContentType("text/html");
			//create a writer to print HTML
			PrintWriter out = response.getWriter();
			Map<String,String[]> es = request.getParameterMap();
			out.println("<HTML>");
			out.println("<BODY>");
			out.println("<table border=1 align=center>");
			out.println("<tr></tr>");
			out.println("<th>parameter<th>value");
			for(Map.Entry<String,String[]> entry: es.entrySet()){
				String key = entry.getKey();
				String[] value = entry.getValue();
				out.println("<tr><td> "+key);
				for(String i: value){
					out.print("   <td>"+ i);
				}
			}
			out.println("</TABLE>");
			out.println("</BODY>");
			out.println("</HTML>");
			out.close();
		}
	
	
}