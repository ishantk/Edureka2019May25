package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edureka.dao.DBHelper;
import co.edureka.model.User;

@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {

	// doPost is just like service method with request and response API's as inputs
	// doPost will be able to handle only post request
	// whereas service method will be able to handle get/post/or any other http method request :)
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 1. Extract Data from Request Object
		
		User user = new User();
				
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
				
		System.out.println(">> "+user);
		
		// 2. Logical operation : Login user by validating from DataBase
		DBHelper db = new DBHelper();
		db.createConnection();
		boolean login = db.loginUser(user);
		db.closeConnection();
		
		// 3. Sending Response back to the client
		response.setContentType("text/html");
		
		String message = "";
		//String url = "<a href='Home'>Enter Home</a>";
		
		// 2. Session Tracking - URL ReWriting
		//String url = "<a href='Home?name="+user.name+"&email="+user.email+"'>Enter Home</a>";
		
		// 3.  Session Tracking - Hidden Form Field
		/*String url = "<form action='Home' method='post'>"
				+ "<input type='hidden' value='"+user.name+"' name='txtName'/>"
				+ "<input type='hidden' value='"+user.email+"' name='txtEmail'/>"
				+ "<input type='submit' value='Enter Home'/>"	
				+ "</form>";*/
		
		String url = "<a href='Home'>Enter Home</a>";
		
		
		if(login){
			
			message = user.name+", Welcome !";
			
			// 1.Session Tracking - Cookies
			/*
			// PS: Cookies will have key and value always as Strings :)
			Cookie ck1 = new Cookie("keyName", user.name);
			Cookie ck2 = new Cookie("keyEmail", user.email);
			
			// Sending cookies to clients machine 
			response.addCookie(ck1);
			response.addCookie(ck2);
			*/
			
			// 4. HttpSession
			HttpSession session = request.getSession();
			session.setAttribute("keyName", user.name);
			session.setAttribute("keyEmail", user.email);
			
		}else{
			message = user.name+", error while login! Please Check you Credentails !";
			//response.sendRedirect("https://www.google.co.in"); // to redirect user to any resource
		}
		
		String htmlResponse = "<html><body><center><br/><br/><h3>"+message+"</h3><br/>"+url+"</center></body></html>";
		
		PrintWriter out = response.getWriter();
		out.print(htmlResponse);
				
		
	}
	
}
