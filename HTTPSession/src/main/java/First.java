// The first servlet
import java.io.*;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
 public class First extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		try { 

			response.setContentType("text/html"); // Setting the content type to text
			PrintWriter out = response.getWriter();

			String n = request.getParameter("userName"); /*Fetching the contents of
												the userName field from the form*/
			out.print("Welcome " + n); // Printing the username

			HttpSession session = request.getSession(); /* Creating a new session*/

			session.setAttribute("uname", n);
			

			out.print("<a href='servlet2'>visit</a>"); // Link to the second servlet

			out.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
