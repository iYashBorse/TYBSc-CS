
<%--
  In this Program the connection to db and all is done in the java bean file itself.
--%>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="external.css">
	</head>

<body>
	<div>


		<jsp:useBean id="obj" class="pack.jspUseBeanProgram" scope="request" ></jsp:useBean>  
	    <jsp:setProperty name ="obj" property="*" />
	     <p>
	        name ::     <jsp:getProperty property="name" name="obj"/><br> 
			password :: <jsp:getProperty property="password" name="obj"/><br> 
	     </p>
		<%
		  obj.insert();
		%>

	</div>
</body>
</html>