import java.io.*;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;  

public class DemoServlet extends HttpServlet {  
public void doGet(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
      
    ServletConfig config=getServletConfig();  
    String driver=config.getInitParameter("driver");  
    out.print("Driver is: "+driver);  
          
    out.close();  
    }  
  
}  