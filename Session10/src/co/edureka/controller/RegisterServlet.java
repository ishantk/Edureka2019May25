package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.dao.DBHelper;
import co.edureka.model.User;

@WebServlet({ "/RegisterServlet", "/Register" })
public class RegisterServlet extends HttpServlet {

	// init is executed when Servlet Object is created in memory by Server
	public void init(ServletConfig config) throws ServletException {
		System.out.println(">> init executed");
	}
	
	// destroy is executed when Servlet Object is deleted from memory by Server when no longer required
	public void destroy() {
		System.out.println(">> destroy executed");
	}

	// service method will take request 
	// extract data from request by using HttpServletRequest API
	// Send back Response to Client by using HttpServletResponse API
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> service executed");
		
		// 1. Extract Data from Request Object
		
		User user = new User();
		
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		System.out.println(">> "+user);
		
		// 2. Save User Object's Data in Table : Servlet interacting with DB :)
		// Logical Operation :)
		DBHelper db = new DBHelper();
		db.createConnection();
		int i = db.registerUser(user); // Save User Object in Table in DataBase
		db.closeConnection();
		
		// 3. Sending Response back to the client
		response.setContentType("text/html");
		
		String message = "";
		
		if(i>0){
			message = user.name+", Thank You for Registering !";
		}else{
			message = user.name+", error while registering! Please Try Again!";
		}
		
		String htmlResponse = "<html><body><center><h3>"+message+"</h3></center></body></html>";
		
		PrintWriter out = response.getWriter();
		out.print(htmlResponse);
	}
}
