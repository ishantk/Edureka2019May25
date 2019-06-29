<%@ page import="co.edureka.model.User"%>
<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>
<%@ page buffer="8kb" %>
<%@ include file="header.jsp" %> 
<%@ page isThreadSafe="true" %> <!-- Synchronized -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Demo</title>
</head>
<body>
	
	<center>
	
		<h3>Welcome to JSP Page</h3>
		
		<%!
			Date date = new Date();
		%>
		
		<h3>Its: <%= date %></h3>
		
		<i>PI is: <% out.print(pi);%></i>
		
		
		
		<h4>Scriptlet:</h4>
		<%
			int a = 10;
			int b = 20;
			int c = a+b;
			out.print("Sum of "+a+" and "+b+" is: "+c);
		%>
		<br/>
		<i>Sum of <% out.print(a); %> and <% out.print(b); %> is <% out.print(c); %></i>
	
		<br/>
		Action Tag:
		<br/>
		<jsp:include page="header.jsp"/>
	
	
		<h4>Declarative:</h4>
		<%!
			double pi = 3.14;
			double areaOfCircle(double radius){
				return pi * radius * radius;
			}
		%>
		
		<h4>Area of Circle with radius 3.57 is: <% out.print(areaOfCircle(3.57)); %> </h4>
		
		<h4>Expression:</h4>
		<h4>Area of Circle with radius 7.57 is: <%= areaOfCircle(7.57) %> </h4>
		
		<%
			int[] arr = {10, 20, 30, 40, 50};
		%>
		
		arr[0] is: <%= arr[0] %>
		
		<%
			User uRef1 = new User(); // Object Construction Statement
			
			uRef1.setName("Kia");	// Setter Methods to write data in object
			uRef1.setEmail("kia@example.com");
		%>
		<h3>Details for uRef1: <%= uRef1.getName() %> | <%= uRef1.getEmail() %></h3>
		
		<jsp:useBean id="uRef2" class="co.edureka.model.User"/>   <!-- Object Construction Statement -->
		
		<!-- Setter Properties to write data in object -->
		<jsp:setProperty property="name" name="uRef2" value="Mike"/>
		<jsp:setProperty property="email" name="uRef2" value="mike@example.com"/>
		
		<h3>
			Details for uRef2:
			<jsp:getProperty property="name" name="uRef2"/> | 
			<jsp:getProperty property="email" name="uRef2"/>
		</h3>
	
		<h3>TagLib Demo:</h3>
		<c:forEach var="i" begin="1" end="10">
			<i>
				<c:out value="${i}"/>
		    </i>
		</c:forEach>
		
		<c:set var="age" value="20"/>
		<h4>Age is: <c:out value="${age}"/></h4>
	
	</center>
	
</body>
</html>