// Java program to show servlet example
import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Extend HttpServlet class
public class AdvanceJavaConcepts extends HttpServlet
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String output;
	
// Initializing servelet
public void init() throws ServletException
{
	output = "Advance Java Concepts";
}

// Requesting and printing the output
public void doGet(HttpServletRequest req,
					HttpServletResponse resp)
	throws ServletException, IOException
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println(output);
	}

	public void destroy()
	{
		System.out.println("Over");
	}
}
