package com.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;


public class AddServlet extends HttpServlet {
		public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
		{
			int i=Integer.parseInt(req.getParameter("num1"));
			int j=Integer.parseInt(req.getParameter("num2"));
			
			int k=i+j;
			
			//k=k*k;
			res.sendRedirect("sq");
			//PrintWriter out=res.getWriter();
			//out.println("result is:" +k);
			//req.setAttribute("k",k);
		//req dispatcher
			//RequestDispatcher rd=req.getRequestDispatcher("sq");
		//	rd.forward(req, res);
		}
		
	}
	

