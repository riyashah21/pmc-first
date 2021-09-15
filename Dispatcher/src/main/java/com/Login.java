package com;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
  
public class Login extends HttpServlet {
  
    public void doPost(HttpServletRequest req,
                       HttpServletResponse res) 
throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
  
        
        String n = req.getParameter("userName");
        String p = req.getParameter("userPass");
    if(p.equals("Thanos")){
            RequestDispatcher rd = req.getRequestDispatcher("servlet2");
            
            rd.forward(req, res); 
    }  
    else{
            out.print("Password mismatch");
            RequestDispatcher rd = req.getRequestDispatcher("/index.html");
         
        rd.include(req, res);  
                        
        }  
    }  
    
}