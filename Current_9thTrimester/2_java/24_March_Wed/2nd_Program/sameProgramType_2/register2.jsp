<html>
<head>
	<link rel="stylesheet" type="text/css" href="external.css">
</head>
<body>
	<div>
     <%@ page import="java.sql.*" %>
		
		<jsp:useBean id="obj" class="pack.javaBean" scope="request" ></jsp:useBean>  
        <jsp:setProperty name ="obj" property="*" />

       <p>
        Name :: <jsp:getProperty property="name" name="obj"/><br> 
	    Password :: <jsp:getProperty property="password" name="obj"/><br> 
	   </p>


<%
		String fetchedPassword = obj.getPassword();
		String fetchedUserName= obj.getName();
		 try{     
		 	        Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver Loaded successfully");
					// Here you need to change the db name and all according to your database.
					// am using xampp so my page address is different.
					Connection con = DriverManager.getConnection("jdbc:mysql://192.168.64.3/trivial","shaun","root");
         			PreparedStatement stmt = con.prepareStatement("insert into user values(?,?)");
			        stmt.setString(1,fetchedUserName);
			         stmt.setString(2,fetchedPassword);
         			 stmt.executeUpdate();

		         	out.println("Database successfully updated.");

					stmt.close();
					con.close();

			}       catch(Exception e){
			  		out.println(e);
			        }
	
	
%>


</div></body></html>