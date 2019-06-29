<%@page import="co.edureka.dao.DBHelper"%>
<%@page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Logging In User</title>
</head>
<body>

	<h3>Logging In.... ${param.txtEmail} </h3>

	<%
		// Read data from Request
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		// Perform logical operation to save User object in database using jdbc :)
		DBHelper db = new DBHelper();
		db.createConnection();
		boolean result = db.loginUser(user);
		db.closeConnection();
		
		if(result){
			
			// Session Tracking - Cookies
			/*
			Cookie ck1 = new Cookie("keyName", user.name);
			Cookie ck2 = new Cookie("keyEmail", user.email);
			
			response.addCookie(ck1);
			response.addCookie(ck2);
			*/
			// URL Re-Writing and Hidden FormFields -> Explore
			
			// Session Tracking - HttpSession Object
			session.setAttribute("keyName", user.name);
			session.setAttribute("keyEmail", user.email);
			
			// Session Tracking - PageContext Object
			pageContext.setAttribute("keyName", user.name, pageContext.SESSION_SCOPE);
	%>
		<%-- <h3>Welcome <%= user.name %></h3>
		<a href="home.jsp">Enter Home</a> --%>
		
		<jsp:forward page="home.jsp"/>
		
	<%		
		}else{
			response.sendRedirect("https://www.google.co.in");
	 %>
	 	<h3>Sorry, <%= user.name %> !! Something Went Wrong !!</h3>
	 <%			
		}
	%>

</body>
</html>