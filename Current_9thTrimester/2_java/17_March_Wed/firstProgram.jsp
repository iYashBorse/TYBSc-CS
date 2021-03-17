<html>
<head>
	<link rel="stylesheet" type="text/css" href="external.css">
	<title>
			Display Page
	</title>
</head>
<body>

	<div><center>
		<%

		 String name=request.getParameter("userName");
		 String lastName = request.getParameter("userLastName");
		 String date = request.getParameter("Day");
		 String month = request.getParameter("month");
		 String year = request.getParameter("year");
		 String email = request.getParameter("emailAddress");
		 String zipCodeValue = request.getParameter("zipCode");




		 out.println("name :: "+name+"<br>last name :: "+lastName+" <br>DOB :: "+date+" "+month+" "+year+"<br>email :: "+email+"<br> ZIP Code :: "+ zipCodeValue);
		%>
	</center>
	</div>


</body>
</html>