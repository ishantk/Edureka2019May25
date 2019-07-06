<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	// Extract Data from Request
	String data = request.getParameter("number");

	// Print Table of a Number
	try{
		
		int num = Integer.parseInt(data);
		
		for(int i=1;i<=10;i++){
			out.print(num+" "+i+"'s are "+(num*i)+"<br/>"); // Sending Back the Response :)
		}
		
	}catch(Exception e){
		out.print("<i>Please Enter a Valid Number</i>");
	}

%>