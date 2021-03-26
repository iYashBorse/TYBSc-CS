<%@ page errorPage="errorPage.jsp" %>  

<html>
<head>
	<link rel="stylesheet" type="text/css" href="external.css">
	<title>
		
	</title>
</head>
<body><div>


	<%

		String name = request.getParameter("userName");
		String password =  request.getParameter("userPassword");
		
		if( name.equals("shaun") && password.equals("sheep")){
		out.println("Welcome : Shaun ");
		}
		else
		{%>
			<jsp:forward page="errorPage.jsp" />  
		<%}

		%>
	</div>
</body>
</html>