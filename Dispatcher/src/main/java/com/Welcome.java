package com;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
  
public class Welcome extends HttpServlet {
  
    public void doPost(HttpServletRequest req,
                       HttpServletResponse res)
        throws ServletException, IOException
    {
  
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
  
        
        String n = req.getParameter("userName");
  
        
        out.print("Welcome " + n);
    }
}