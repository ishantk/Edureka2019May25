<%@page import="javax.ws.rs.core.MediaType"%>
<%@page import="javax.ws.rs.core.UriBuilder"%>
<%@page import="javax.ws.rs.client.WebTarget"%>
<%@ page import="javax.ws.rs.client.ClientBuilder"%>
<%@ page import="javax.ws.rs.client.Client"%>
<%@ page import="org.glassfish.jersey.client.ClientConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>RESTful Web Service Demo</title>
</head>
<body>
	<center>
		<h3>Hello from RESTful Client !!</h3>
		
		<%
			// For index.jsp page to be a Client to access web service hello, we need APIs
			ClientConfig clientConfig = new ClientConfig();
			Client client = ClientBuilder.newClient(clientConfig);
			
			// Target the Web Service using Client
			WebTarget target = client.target(UriBuilder.fromUri("http://localhost:8080/Session14REST").build());
			
			// Access Web Methods using WebTarget API in Web Service Hello
			//						         /rest/hello
			String plainResponse = target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class);
			String htmlResponse = target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class);
			String xmlResponse = target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(String.class);
			String jsonResponse = target.path("rest").path("hello").request().accept(MediaType.APPLICATION_JSON).get(String.class);
		
		%>
		
		<h2>Plain Response</h2>
		<%= plainResponse %>
		
		<h2>HTML Response</h2>
		<%= htmlResponse %>
		
		<h2>XML Response</h2>
		<%= xmlResponse %>
		
		<h2>JSON Response</h2>
		<%= jsonResponse %>
		
	</center>
</body>
</html>