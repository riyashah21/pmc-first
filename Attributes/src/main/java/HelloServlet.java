
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class HelloServlet extends HttpServlet { 

 
  public void doGet (HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException { 
    
    resp.setContentType("text/html"); 

   
    ServletOutputStream out = resp.getOutputStream(); 
  
    out.println("<html>"); 
    out.println("<head><title>Hello World</title></head>");
    out.println("<body>");
    out.println("<h1>Hi There!</h1>");
    out.println("</body></html>");
  }
}