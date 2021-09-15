// First java servlet that calls another resource
import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	public void doPost(HttpServletRequest req,
					HttpServletResponse res)
throws ServletException, IOException
	{
		// The method to receive client requests
		// which are sent using 'post'

		res.setContentType("text/html");
		ServletResponse response = null;
		PrintWriter out = response.getWriter();

		// fetches username
		ServletRequest request = null;
		String n = request.getParameter("userName");

		// fetches password
		String p = request.getParameter("userPass");
		if(p.equals("Thanos"))
			{
			RequestDispatcher rd = request.getRequestDispatcher("servlet2");
			// Getting RequestDispatcher object
			// for collaborating with servlet2

			// forwarding the request to servlet2
			rd.forward(request, response);
	}
	else{
			out.print("Password mismatch");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
		
		rd.include(request, response);
						
		}
	}
	
}
