package validation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String uname = req.getParameter("username");
		String pass = req.getParameter("pass");
		
		HttpSession session = req.getSession();
		
		if(uname.equals("Charan") &&  pass.equals("Charan123"))
		{
			session.setAttribute("username",uname );
			session.setAttribute("password",pass );
			
			res.sendRedirect("Dashboard");
			
		}
		else
		{
			out.println("<font color ='red'> Invalid username or password </font>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("index.html");
			dispatcher.include(req, res);
		}
		
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}

}
