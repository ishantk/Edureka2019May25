package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/FrontController", "/Front" })
public class FrontController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. Extracting Data
		// Here we are extracting only hidden field
		String type = request.getParameter("txtType");
		
		// 2. Forward Request to Corresponding Servlet
		if(type.equals("register")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("Register");
			//dispatcher.include(request, response);
			dispatcher.forward(request, response);
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("Login");
			//dispatcher.include(request, response);
			dispatcher.forward(request, response);
		}
		
		// 3. Sending Response back to the client
		response.setContentType("text/html");
		
		String message = "Hello From Front Controller Servlet";
		String htmlResponse = "<html><body><center><h3>"+message+"</h3></center></body></html>";
		
		PrintWriter out = response.getWriter();
		out.print(htmlResponse);
		
	}

}
