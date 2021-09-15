package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;

public class squareservlet extends HttpServlet {
	public void doget(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter out=res.getWriter();
		out.println("hello to sq");
	}

}
