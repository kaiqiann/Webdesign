import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
public class DisplayRequestHeader extends HttpServlet{
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
			//set file type
			response.setContentType("text/html");
			//create a writer to print HTML
			PrintWriter out = response.getWriter();
			Enumeration<String> headernames = request.getHeaderNames();
			out.println("<HTML>");
			out.println("<BODY>");
			out.println("Using getHeaderNames: <br>" );
			while(headernames.hasMoreElements()){
				out.println("\\\\\\\\\\\\");
				String hn = headernames.nextElement();
				//Enumeration<String> headers = request.getHeaders(hn);
				out.println("Header: "+hn);
				//while(headers.hasMoreElements()){
					out.println("&emsp; &emsp; &emsp; Header Value: "+ request.getHeader(hn) +"<br>");
				//}
				
			}
			out.println("<BODY>");
			out.println("<HTML>");
			out.close();
		}
	
	
}