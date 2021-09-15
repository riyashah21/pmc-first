// The second servlet
import java.io.*;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Second extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException 

	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession(false);
		/*Resuming the session created
										in the previous servlet using
										the same method that was used
										to create the session.
										The boolean parameter 'false'
										has been passed so that a new session
										is not created since the session already
										exists*/

		String n = (String)session.getAttribute("uname");
		out.print("Hello " + n);

		out.close();


}
}
