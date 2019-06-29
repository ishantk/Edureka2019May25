<%@ page import="co.edureka.dao.DBHelper"%>
<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registering User</title>
</head>
<body>

	<%
		// Read data from Request
		User user = new User();
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		// Perform logical operation to save User object in database using jdbc :)
		DBHelper db = new DBHelper();
		db.createConnection();
		int i = db.registerUser(user);
		db.closeConnection();
		
		if(i>0){
	%>
		<h3>Thank you for Registering with us <%= user.name %></h3>
	<%		
		}else{
	 %>
	 	<h3>Sorry, <%= user.name %> !! Something Went Wrong !!</h3>
	 <%			
		}
	%>

</body>
</html>