package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet({ "/WelcomeServlet", "/Home" })
public class WelcomeServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
//		String message = "Welcome Home Dear User";
		String message = "";
		String email = "";
		Date date = new Date();
		String dateTimeStamp = date.toString();
	
		/*
		Cookie[] ckArr = request.getCookies(); // Read all the cookies of our application
		for(Cookie ck : ckArr){
			if(ck.getName().equals("keyName")){
				message = "Welcome, "+ck.getValue()+" to Home !!";
			}
			
			if(ck.getName().equals("keyEmail")){
				email = ck.getValue();
			}
		}
		*/
		
//		message = "Welcome "+request.getParameter("name")+" to Home !!";
//		email = request.getParameter("email");
		
//		message = "Welcome "+request.getParameter("txtName")+" to Home !!";
//		email = request.getParameter("txtEmail");
		
		HttpSession session = request.getSession();
		
		message = "Welcome "+session.getAttribute("keyName")+" to Home !!";
		email = (String)session.getAttribute("keyEmail");
		
		
		String htmlResponse = "<html><body><center><h3>"+message+"</h3>"+email+"<br/>"+date+"</center></body></html>";
		
		PrintWriter out = response.getWriter();
		out.print(htmlResponse);
	}

}
