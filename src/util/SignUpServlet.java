package util;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.SignUpValidator;
import util.Constants;

//import org.apache.log4j.Logger;

/**
 * Servlet implementation class SignUpServlet
 */

//@WebServlet("/signUp")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//Logger log = Logger.getLogger(SignUpServlet.class.getName());
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		SignUpValidator signUpValidateObj = new SignUpValidator();
		
		//log.debug("***** Inside doPost SignUpServlet *****");
		
		System.out.println("request object --- "+request);
		System.out.println("***** Inside doPost SignUpServlet *****");
		System.out.println("University ID ----> "+request.getParameter("username"));
		System.out.println("Mobile ----> "+request.getParameter("mobile"));
		System.out.println("submit -->"+request.getParameter("submit"));
		
		if(request.getParameter("submit") != null)
		{
			if(signUpValidateObj.signUpValidate(request, response) == Constants.SUCCESS)
			{
				System.out.println("signUpValidateObj.signUpValidate(request, response) -- SUCCESS");
				request.getRequestDispatcher("HomePage.jsp").forward(request, response);
			}
			else
				request.getRequestDispatcher("SignUp.jsp").forward(request, response);
		}
		
		//doGet(request, response);
	}

}
