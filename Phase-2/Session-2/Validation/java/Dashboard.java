package validation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		HttpSession session = req.getSession();
		
		if(session.getAttribute("username")!=null)
		{
			out.println(session.getAttribute("username")+"Logged in successfully <br>");
			out.println("<a href = 'Logout'> Logout </a>");
		}
		
		
	}

}
