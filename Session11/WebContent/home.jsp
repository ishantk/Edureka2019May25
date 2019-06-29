<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
	<center>
	
		<%-- <%
			Cookie[] ckArr = request.getCookies();
			String name = "", email = "";
			for(Cookie ck : ckArr){
				if(ck.getName().equals("keyName")){
					name = ck.getValue();
				}
				
				if(ck.getName().equals("keyEmail")){
					email = ck.getValue();
				}
			}
			
		%> --%>
		
		<br/>
	
		<%-- <h3>Welcome Home, <%= name %> !!</h3>
		<i><%= email %></i> --%>
		
		<h3>Welcome Home, <%= session.getAttribute("keyName") %> !!</h3>
		<i><%= session.getAttribute("keyEmail") %></i>
		
		<%-- <%
			pageContext.getAttribute("keyName", pageContext.SESSION_SCOPE);
		%> --%>
	
	
	</center>
</body>
</html>