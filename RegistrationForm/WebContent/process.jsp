<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%> 


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


  
<%  
String name,email,pass;
name=request.getParameter("uname");
email=request.getParameter("uemail");
pass=request.getParameter("upass");


try {
	Class.forName("oracle.jdbc.OracleDriver");
	
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","AASTHA","capgemini#123");

	PreparedStatement ps=con.prepareStatement("insert into user432 values(?,?,?)");  
	ps.setString(1,name);  
	ps.setString(2,email);  
	ps.setString(3,pass);  

	ps.executeUpdate();
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



out.print("You are successfully registered......CHECK DB");  
  
%>  


</body>
</html>