// Called servlet in case password matches
import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {

	public void doPost(HttpServletRequest request,
					HttpServletResponse response)
		throws ServletException, IOException
	{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// fetches username
		String n = request.getParameter("userName");

		// prints the message
		out.print("Welcome " + n);
	}
}
